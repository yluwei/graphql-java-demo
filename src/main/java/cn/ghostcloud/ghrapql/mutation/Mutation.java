package cn.ghostcloud.ghrapql.mutation;

import cn.ghostcloud.ghrapql.dao.TenantUserDao;
import cn.ghostcloud.ghrapql.dao.UserDao;
import cn.ghostcloud.ghrapql.entity.TenantUser;
import cn.ghostcloud.ghrapql.entity.User;
import cn.ghostcloud.ghrapql.input.UserInput;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 变更
 *
 * @author yanluwei
 * @date 2020/7/22
 */
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private UserDao userDao;
    @Autowired
    private TenantUserDao tenantUserDao;

    public User addUser(UserInput user) {
        User u = new User();
        BeanUtils.copyProperties(user, u);
        User save = userDao.save(u);
        TenantUser tu = new TenantUser();
        tu.setTenantId(user.getTenantId());
        tu.setUserId(save.getId());
        tenantUserDao.save(tu);
        return save;
    }
}
