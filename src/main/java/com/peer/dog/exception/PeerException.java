package com.peer.dog.exception;

/**
 * @author stephen.zhang
 * @date 2018/7/17.
 */
public class PeerException extends RuntimeException {
    private static final long serialVersionUID = 8489770788411997599L;

    ErrorCode errorCode;

    public PeerException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public PeerException(String message) {
        super(message);
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
