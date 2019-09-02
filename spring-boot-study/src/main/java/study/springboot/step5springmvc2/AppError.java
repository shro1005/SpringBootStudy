package study.springboot.step5springmvc2;

/**
 * 2019.08.30 ExceptionHandler 학습
 */
public class AppError {

    private String message;

    private String reason;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}