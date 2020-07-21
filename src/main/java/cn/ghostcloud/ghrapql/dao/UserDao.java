package cn.ghostcloud.ghrapql.dao;

import cn.ghostcloud.ghrapql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 租户dao
 *
 * @author yanluwei
 * @date 2020/7/21
 */
public interface UserDao extends JpaRepository<User, Integer> {

    @Query(value = "select u.* from user u join tenant_user tu on u.id = tu.user_id " +
        "where tu.tenant_id = ?1", nativeQuery = true)
    List<User> listByTenant(Integer tenantId);
}
