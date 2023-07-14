package pro.sky.coursetwo.examinerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AlreadyQuestionException extends RuntimeException {
    public AlreadyQuestionException() {
    }

    public AlreadyQuestionException(String message) {
        super(message);
    }

    public AlreadyQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlreadyQuestionException(Throwable cause) {
        super(cause);
    }

    public AlreadyQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
