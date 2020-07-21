package cn.ghostcloud.ghrapql.resolver;

import cn.ghostcloud.ghrapql.dao.UserDao;
import cn.ghostcloud.ghrapql.entity.Role;
import cn.ghostcloud.ghrapql.entity.Tenant;
import cn.ghostcloud.ghrapql.entity.User;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * tenant解析，泛型内类型要与查询类型相同
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class TenantResolver implements GraphQLResolver<Tenant> {

    @Autowired
    private UserDao userDao;

    /**
     * 查询租户用户，租户解析，方法第一个参数默认为当前对象本身
     *
     * @param tenant 租户信息
     * @return {@link Role}
     * @author yanluwei
     * @date 2020/7/15
     */
    public List<User> getUser(Tenant tenant) {
        return userDao.listByTenant(tenant.getId());
    }
}
