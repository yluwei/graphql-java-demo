package cn.ghostcloud.ghrapql.dao;

import cn.ghostcloud.ghrapql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 租户dao
 *
 * @author yanluwei
 * @date 2020/7/21
 */
public interface PersonDao extends JpaRepository<Person, Integer> {
    List<Person> findPersonsByUserId(Integer userId);
}