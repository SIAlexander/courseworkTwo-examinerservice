package pro.sky.coursetwo.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoObjectException extends RuntimeException {
    public NoObjectException() {
    }

    public NoObjectException(String message) {
        super(message);
    }

    public NoObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoObjectException(Throwable cause) {
        super(cause);
    }

    public NoObjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
