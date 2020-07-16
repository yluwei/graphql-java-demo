package cn.ghostcloud.ghrapql.query;

import cn.ghostcloud.ghrapql.entity.Role;
import cn.ghostcloud.ghrapql.entity.User;
import cn.ghostcloud.ghrapql.enums.RoleTypeEnum;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

/**
 * user解析，泛型内类型要与查询类型相同
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class RoleResolver implements GraphQLResolver<Role> {

    public RoleTypeEnum getRoleTypeName(Role role) {
        return RoleTypeEnum.FINANCING;
    }
}
