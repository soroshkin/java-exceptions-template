package com.epam.izh.rd.online.exception;

//This class extends Exception, because client code can recover from
//that exception - it can try to get access with other credentials,
//rather than kill application.
public class NotAccessException extends Exception {
    public NotAccessException() {
        super();
    }

    public NotAccessException(String message) {
        super(message);
    }

    public NotAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAccessException(Throwable cause) {
        super(cause);
    }
}
