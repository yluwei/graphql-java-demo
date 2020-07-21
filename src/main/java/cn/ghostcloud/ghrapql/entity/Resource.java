package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 资源
 *
 * @author yanluwei
 * @date 2020/7/21
 */
@Data
@Entity
public class Resource {
    @Id
    private Integer id;
    private String name;
    private String code;
}
