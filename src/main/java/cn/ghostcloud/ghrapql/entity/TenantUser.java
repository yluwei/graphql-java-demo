package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 租户用户
 *
 * @author yanluwei
 * @date 2020/7/22
 */
@Data
@Entity
public class TenantUser {
    @Id
    private Integer id;
    private Integer tenantId;
    private Integer userId;
}
