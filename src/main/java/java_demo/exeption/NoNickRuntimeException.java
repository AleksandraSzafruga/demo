package java_demo.exeption;

import java.util.Random;

public class NoNickRuntimeException extends RuntimeException{
    public NoNickRuntimeException() {
    }

    public NoNickRuntimeException(String message) {
        super(message);
    }

    public NoNickRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickRuntimeException(Throwable cause) {
        super(cause);
    }

    public NoNickRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}