package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

/**
 * 角色
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
public class Role {
    private Integer id;
    private String name;
    private String description;
    private Integer roleType;
}
