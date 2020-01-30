package com.itheima.test;

import config.JdbcConfig;
import config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.sql.*;

/**
 * @Description: 注解测试
 * @Author: Kris
 * Date: 2020/1/27 15:40
 */
public class SpringAnnotationTest {
    public static void main(String[] args){
        /**
         * 测试方法
         * @param args
         */
        // 1.创建容器（基于注解的创建方式）
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("config");
        SpringConfiguration springConfiguration = ac.getBean("springConfiguration", SpringConfiguration.class);
        System.out.println(springConfiguration);
        // 2.根据Bean的Id获取对象
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        // 3.执行操作
        jdbcTemplate.update("insert into account(name, money) values ('test',12345)");
    }
}
