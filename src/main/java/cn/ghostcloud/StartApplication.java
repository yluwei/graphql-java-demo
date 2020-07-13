package cn.ghostcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author yanluwei
 * @date 2020/7/6
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.ghostcloud.ghrapql.book.dao")
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
