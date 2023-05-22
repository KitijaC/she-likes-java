package com.sda.she_likes_java.exceptions;

public class HSMConnectionException extends Exception {
    public HSMConnectionException() {
    }

    public HSMConnectionException(String message) {
        super(message);
    }

    public HSMConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public HSMConnectionException(Throwable cause) {
        super(cause);
    }
}
