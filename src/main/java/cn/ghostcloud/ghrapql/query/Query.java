package cn.ghostcloud.ghrapql.query;

import cn.ghostcloud.ghrapql.entity.Enterprise;
import cn.ghostcloud.ghrapql.entity.Person;
import cn.ghostcloud.ghrapql.entity.Role;
import cn.ghostcloud.ghrapql.entity.User;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * 博客
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class Query implements GraphQLQueryResolver {

    public static Map<Integer, User> userMap;
    public static Map<Integer, Role> roleMap;

    @PostConstruct
    private void init() {
        Person person = new Person();
        person.setId(1);
        person.setUsername("person001");
        person.setEmail("001@166.com");
        person.setRoleId(1);
        person.setAge(18);
        person.setIdCard("5101001010101010101");
        userMap.put(1, person);
        Enterprise ep = new Enterprise();
        ep.setId(2);
        ep.setUsername("person001");
        ep.setEmail("001@166.com");
        ep.setRoleId(2);
        ep.setCreditCode("9125JKJ21256321523");
        ep.setEmployees(1001);
        userMap.put(2, ep);
        Role role = new Role();
        role.setId(1);
        role.setName("个人管理员");
        role.setDescription("一个合格的管理员");
        roleMap.put(1, role);
        Role role1 = new Role();
        role.setId(2);
        role.setName("企业管理员");
        role.setDescription("负责企业日常工作");
        roleMap.put(2, role1);
    }

    /**
     * <field>
     * is<field> – only if the field is of type Boolean
     * get<field>
     * 方法名符合以上三种方式会自动对应到Query类型的字段上
     *
     * @param id 用户id
     * @return {@link List<User>}
     * @author yanluwei
     * @date 2020/7/13
     */
    public User users(Integer id) {
        return userMap.get(id);
    }
}
