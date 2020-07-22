package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private Integer age;
    private String email;
    private String phone;
    private String intro;
    private String address;
}
