package cn.ghostcloud.ghrapql.dao;


import cn.ghostcloud.ghrapql.entity.Tenant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * 测试
 *
 * @author yanluwei
 * @date 2020/7/21
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TenantDaoTest {

    @Autowired
    private TenantDao tenantDao;

    @Test
    public void queryTenant(){
        Tenant tenant = tenantDao.findById(1).orElse(null);
        System.out.println(tenant);
    }
}