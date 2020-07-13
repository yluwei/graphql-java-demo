package cn.ghostcloud.ghrapql.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 接口返回模板类
 *
 * @author luoyuping
 * @date 2019/04/17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate<T> {
    public static final String SUCESS_CODE = "200";
    public static final String APP_EXCEPTION = "400";
    public static final String UNKNOWN_EXCEPTION = "500";
    // 执行成功，但需要展示返回信息（异常信息）
    public static final String VIEW_MESSAGE_CODE = "200400";
    private Boolean success;
    private String msg;
    private String code;
    private T data;

    public static ResponseTemplate ok() {

        return ok(null);
    }

    public static <T> ResponseTemplate<T> ok(T data) {
        ResponseTemplate<T> response = new ResponseTemplate<>();
        response.setCode(SUCESS_CODE);
        response.setMsg("OK");
        response.setSuccess(true);
        response.setData(data);
        return response;
    }
}