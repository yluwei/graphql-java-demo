package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 个人
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
@Entity
public class Person implements Customer {
    @Id
    private Integer id;
    private String name;
    private String idCard;
    private Integer age;
    private Integer userId;
}
