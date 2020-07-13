package cn.ghostcloud.ghrapql.blog.query;

import cn.ghostcloud.ghrapql.blog.dao.AuthorDao;
import cn.ghostcloud.ghrapql.blog.entity.Author;
import cn.ghostcloud.ghrapql.blog.entity.Post;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * post解析，泛型内类型要与查询类型相同
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class PostResolver implements GraphQLResolver<Post> {

    @Autowired
    private AuthorDao authorDao;

    public Author getAuthor(Post post) {
        return authorDao.listAuthor(post.getAuthorId());
    }
}
