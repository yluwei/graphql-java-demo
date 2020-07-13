package cn.ghostcloud.ghrapql.book.dao;

import cn.ghostcloud.ghrapql.book.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户查询
 *
 * @author yanluwei
 * @date 2020/7/6
 */
public interface UserDao {
    @Select("select * from user")
    List<User> listUser();
}
