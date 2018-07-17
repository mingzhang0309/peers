package com.peer.dog.filter;

import com.peer.dog.dao.TbLoginMapper;
import com.peer.dog.dao.entity.TbLogin;
import com.peer.dog.dao.entity.TbLoginExample;
import com.peer.dog.util.HttpHeaderUtil;
import org.springframework.core.annotation.Order;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

/**
 * @author stephen.zhang
 * @date 2018/6/18.
 */
@Order(1)
@WebFilter(filterName = "tokenFilter", urlPatterns = "/*")
public class TokenFilter implements Filter {
    private static final Set<String> NEED_FILTER = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("/comment", "/feed/follow", "/feed/pick", "/user", "/user/peers",
            "/user/pass", "user/info")));

    @Resource
    TbLoginMapper tbLoginMapper;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        String path = request.getRequestURI().substring(request.getContextPath().length()).replaceAll("[/]+$", "");
        String token = request.getHeader(HttpHeaderUtil.TOKEN);
        if(!StringUtils.isEmpty(token)) {
            TbLoginExample example = new TbLoginExample();
            example.createCriteria().andTokenEqualTo(token);
            List<TbLogin> tbLogins = tbLoginMapper.selectByExample(example);
            if(NEED_FILTER.contains(path)) {
                if(CollectionUtils.isEmpty(tbLogins) || tbLogins.size() > 1) {
                    throw new RuntimeException("用户登陆失效");
                }
            }

            if(!CollectionUtils.isEmpty(tbLogins)) {
                HttpHeaderUtil.setUserId(tbLogins.get(0).getUserId());
            }
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        HttpHeaderUtil.clear();
    }
}
