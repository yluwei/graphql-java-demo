package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 角色
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
@Entity
public class Role {
    @Id
    private Integer id;
    private String name;
}
