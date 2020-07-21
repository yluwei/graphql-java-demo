package cn.ghostcloud.ghrapql.dao;

import cn.ghostcloud.ghrapql.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 资源dao
 *
 * @author yanluwei
 * @date 2020/7/21
 */
public interface ResourceDao extends JpaRepository<Resource, Integer> {

    @Query(value = "select rs.* from resource rs join role_resource rr on rs.id = rr.resource_id " +
        "where rr.role_id = ?1", nativeQuery = true)
    List<Resource> listByRole(Integer roleId);
}
