package cn.ghostcloud.ghrapql.blog.mutation;

import cn.ghostcloud.ghrapql.blog.dao.PostDao;
import cn.ghostcloud.ghrapql.blog.entity.Post;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 写博客
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class PostMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private PostDao postDao;

    public Post writePost(String title, String text, String category) {
        Post post = new Post();
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        postDao.insert(post);
        return post;
    }
}
