package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

/**
 * 用户
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String email;
    private Integer roleId;
}
