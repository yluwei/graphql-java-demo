package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

/**
 * 创建用户
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
public class UserInput {
    private Integer id;
    private String username;
    private String email;
}
