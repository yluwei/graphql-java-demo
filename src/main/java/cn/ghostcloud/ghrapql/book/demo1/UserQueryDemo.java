package cn.ghostcloud.ghrapql.book.demo1;

import cn.ghostcloud.ghrapql.book.dao.UserDao;
import cn.ghostcloud.ghrapql.book.entity.User;
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 查询
 *
 * @author yanluwei
 * @date 2020/7/6
 */
@Component
public class UserQueryDemo { //implements GraphQLQueryResolver {
    @Resource
    private UserDao userDao;

    public List<User> users() throws Exception {
        System.out.println("users");
        return userDao.listUser();
    }

    public User getUser(Integer id) {
        System.out.println("getUser");
        List<User> users = userDao.listUser();
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
