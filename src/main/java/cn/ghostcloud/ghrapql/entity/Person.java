package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

/**
 * 个人
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
public class Person extends User {
    private String idCard;
    private Integer age;
}
