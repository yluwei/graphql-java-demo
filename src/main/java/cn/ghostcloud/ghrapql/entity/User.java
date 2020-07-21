package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String username;
    private Integer age;
    private String email;
    private String phone;
    private String intro;
    private String address;
}
