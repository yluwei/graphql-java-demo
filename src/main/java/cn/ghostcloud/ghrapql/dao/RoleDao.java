package cn.ghostcloud.ghrapql.dao;

import cn.ghostcloud.ghrapql.entity.Role;
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
public interface RoleDao extends JpaRepository<Role, Integer> {

    @Query(value = "select r.* from role r join user_role ur on r.id = ur.role_id " +
        "where ur.user_id = ?1", nativeQuery = true)
    List<Role> listByUser(Integer userId);
}
