package cn.ghostcloud.ghrapql.input;

import lombok.Data;

/**
 * 输入类型
 *
 * @author yanluwei
 * @date 2020/7/22
 */
@Data
public class UserInput {
    private Integer tenantId;
    private Integer id;
    private String username;
    private String age;
    private String email;
    private String phone;
    private String intro;
    private String address;
}
