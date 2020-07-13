package cn.ghostcloud.ghrapql.book.entity;

import lombok.Data;

/**
 * 用户实体类
 *
 * @author yanluwei
 * @date 2020/7/6
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String className;
    private Integer sex;
    private Integer age;
}
