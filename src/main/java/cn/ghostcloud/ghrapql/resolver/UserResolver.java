package cn.ghostcloud.ghrapql.resolver;

import cn.ghostcloud.ghrapql.dao.EnterpriseDao;
import cn.ghostcloud.ghrapql.dao.PersonDao;
import cn.ghostcloud.ghrapql.dao.RoleDao;
import cn.ghostcloud.ghrapql.entity.Customer;
import cn.ghostcloud.ghrapql.entity.Enterprise;
import cn.ghostcloud.ghrapql.entity.Person;
import cn.ghostcloud.ghrapql.entity.Role;
import cn.ghostcloud.ghrapql.entity.User;
import cn.ghostcloud.ghrapql.query.Query;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * user解析，泛型内类型要与查询类型相同
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class UserResolver implements GraphQLResolver<User> {

    @Autowired
    private RoleDao roleDao;
    @Autowired
    private PersonDao personDao;
    @Autowired
    private EnterpriseDao enterpriseDao;

    /**
     * 查询用户角色，用户解析，方法第一个参数默认为当前对象本身
     *
     * @param user 用户信息
     * @return {@link Role}
     * @author yanluwei
     * @date 2020/7/15
     */
    public List<Role> getRole(User user) {
        return roleDao.listByUser(user.getId());
    }

    public List<Customer> getCustomer(User user) {
        List<Person> persons = this.personDao.findPersonsByUserId(user.getId());
        List<Enterprise> enterprises = enterpriseDao.findEnterprisesByUserId(user.getId());
        List<Customer> collect = persons.stream().map(person -> (Customer) person).collect(Collectors.toList());
        collect.addAll(enterprises.stream().map(person -> (Customer) person).collect(Collectors.toList()));
        return collect;
    }
}
