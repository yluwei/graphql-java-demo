package cn.ghostcloud.ghrapql.resolver;

import cn.ghostcloud.ghrapql.dao.ResourceDao;
import cn.ghostcloud.ghrapql.entity.Resource;
import cn.ghostcloud.ghrapql.entity.Role;
import cn.ghostcloud.ghrapql.entity.User;
import cn.ghostcloud.ghrapql.enums.RoleTypeEnum;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user解析，泛型内类型要与查询类型相同
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class RoleResolver implements GraphQLResolver<Role> {

    @Autowired
    private ResourceDao resourceDao;

    public List<Resource> getResource(Role role) {
        return resourceDao.listByRole(role.getId());
    }
}
