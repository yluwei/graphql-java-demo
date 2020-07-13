package cn.ghostcloud.ghrapql.blog.dao;

import cn.ghostcloud.ghrapql.blog.entity.Author;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 博客查询
 *
 * @author yanluwei
 * @date 2020/7/6
 */
@Repository
public interface AuthorDao {
    @Select("select * from author where id = #{id} limit 1")
    Author listAuthor(Integer id);
}
