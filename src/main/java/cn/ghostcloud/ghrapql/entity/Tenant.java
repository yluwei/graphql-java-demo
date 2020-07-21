package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 租户
 *
 * @author yanluwei
 * @date 2020/7/21
 */
@Data
@Entity
public class Tenant {
    @Id
    private Integer id;
    private String name;
    private String description;
}
