package cn.ghostcloud.ghrapql.common;


/**
 * @Classname AppException
 * @Description 应用业务异常
 * @Author futao@ghostcloud.cn
 * @Data 创建时间：2019/4/2
 * @Version 1.0
 */
public class AppException extends RuntimeException {

    private String errorCode = "400";

    public AppException(String message) {
        super(message);
    }

    public AppException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public AppException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public AppException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public AppException(String errorCode, String message, Throwable cause,
                        boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
