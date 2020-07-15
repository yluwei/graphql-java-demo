package cn.ghostcloud.ghrapql.mutation;

import cn.ghostcloud.ghrapql.entity.Person;
import cn.ghostcloud.ghrapql.entity.User;
import cn.ghostcloud.ghrapql.entity.UserInput;
import cn.ghostcloud.ghrapql.query.Query;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Service;

/**
 * 写博客
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class Mutation implements GraphQLMutationResolver {

    public User addUser(UserInput user) {
        Person user1 = new Person();
        user1.setId(3);
        user1.setUsername(user.getUsername());
        user1.setEmail(user.getEmail());
        Query.userMap.put(3, user1);
        return user1;
    }
}
