package com.bupt317.study.lab_manager.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration注解
//该注解说明了这是一个配置类，spring boot在启动的时候会自动扫描其下的@bean注解
//spring boot会将其加入容器进行自动管理

//@PropertySource注解
//该注解会引入数据库参数配置文件，classpath指向资源文件夹（即resources）

@Configuration
@PropertySource("classpath:config/db.properties")
public class DataSourceConfig
{
    //@Value注解
    //可以引入properties的属性值赋值给下面的变量
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.driverClassName}")
    private String driverClassName;

    //@Bean注解标注了该方法的返回对象将被spring boot托管
    //在下面的方法中新建了一个连接池，对其进行配置，最后返回一个连接池对象

    //@Primary注解表示该Bean对象会覆盖掉spring boot托管的其他同名对象

    @Bean
    @Primary
    public DataSource dataSource()
    {
        //新建一个连接池对象
        DruidDataSource dataSource=new DruidDataSource();
        //自定义参数
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        //返还给spring boot容器
        return dataSource;
    }


}
