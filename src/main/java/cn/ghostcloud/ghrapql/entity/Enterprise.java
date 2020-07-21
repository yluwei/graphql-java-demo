package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 企业
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
@Entity
public class Enterprise implements Customer {
    @Id
    private Integer id;
    private String name;
    private String creditCode;
    private Integer employees;
    private Integer userId;
}
