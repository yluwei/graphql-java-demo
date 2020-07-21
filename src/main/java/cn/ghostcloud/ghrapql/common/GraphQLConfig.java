package cn.ghostcloud.ghrapql.common;

import cn.ghostcloud.ghrapql.entity.Enterprise;
import cn.ghostcloud.ghrapql.entity.Person;
import com.coxautodev.graphql.tools.SchemaParserDictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置
 *
 * @author yanluwei
 * @date 2020/7/21
 */
@Configuration
public class GraphQLConfig {

    @Bean
    public SchemaParserDictionary schemaParserDictionary() {
        return new SchemaParserDictionary()
            .add(Person.class)
            .add(Enterprise.class);
    }
}
