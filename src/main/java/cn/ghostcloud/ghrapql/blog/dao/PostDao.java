package cn.ghostcloud.ghrapql.blog.dao;

import cn.ghostcloud.ghrapql.blog.entity.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 博客查询
 *
 * @author yanluwei
 * @date 2020/7/6
 */
@Repository
public interface PostDao {
    @Select("select * from post")
    List<Post> listPost();

    int insert(Post post);
}
