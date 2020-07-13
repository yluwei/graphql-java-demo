package cn.ghostcloud.ghrapql.blog.query;

import cn.ghostcloud.ghrapql.blog.dao.PostDao;
import cn.ghostcloud.ghrapql.blog.entity.Post;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class PostQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PostDao postDao;

    /**
     * <field>
     * is<field> – only if the field is of type Boolean
     * get<field>
     * 方法名符合以上三种方式会自动对应到Query类型的字段上
     *
     * @param count  每页显示记录数
     * @param offset 偏移量
     * @return {@link List< Post >}
     * @author yanluwei
     * @date 2020/7/13
     */
    public List<Post> recentPosts(Integer count, Integer offset) {
        return postDao.listPost();
    }
}
