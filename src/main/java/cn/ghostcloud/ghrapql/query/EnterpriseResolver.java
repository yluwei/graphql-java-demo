package cn.ghostcloud.ghrapql.query;

import cn.ghostcloud.ghrapql.entity.Enterprise;
import cn.ghostcloud.ghrapql.entity.Role;
import cn.ghostcloud.ghrapql.entity.User;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

/**
 * user解析，泛型内类型要与查询类型相同
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Service
public class EnterpriseResolver implements GraphQLResolver<Enterprise> {

    /**
     * 查询用户角色，用户解析，方法第一个参数默认为当前对象本身
     *
     * @param user 用户信息
     * @return {@link Role}
     * @author yanluwei
     * @date 2020/7/15
     */
    public Role getRole(Enterprise user) {
        return Query.roleMap.get(user.getRoleId());
    }
}
