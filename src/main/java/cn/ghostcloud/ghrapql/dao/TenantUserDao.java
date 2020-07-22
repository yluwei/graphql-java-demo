package cn.ghostcloud.ghrapql.dao;

import cn.ghostcloud.ghrapql.entity.TenantUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 租户dao
 *
 * @author yanluwei
 * @date 2020/7/21
 */
public interface TenantUserDao extends JpaRepository<TenantUser, Integer> {
}
