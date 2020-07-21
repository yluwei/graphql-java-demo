package cn.ghostcloud.ghrapql.query;

import cn.ghostcloud.ghrapql.dao.RoleDao;
import cn.ghostcloud.ghrapql.dao.TenantDao;
import cn.ghostcloud.ghrapql.dao.UserDao;
import cn.ghostcloud.ghrapql.entity.Role;
import cn.ghostcloud.ghrapql.entity.Tenant;
import cn.ghostcloud.ghrapql.entity.User;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 程序入口
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class Query implements GraphQLQueryResolver {

    @Autowired
    private TenantDao tenantDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    /**
     * 三种命名方式：
     * <field>/get<field>/is<field><
     */
    public List<Tenant> tenants() {
        return tenantDao.findAll();
    }

    /**
     * 根据id查询用户
     */
    public User getUser(Integer id) {
        return userDao.findById(id).orElse(null);
    }

    public List<Role> roles() {
        return roleDao.findAll();
    }
}
