package com.bupt317.study.lab_manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//告诉spring boot mapper接口的位置，spring自动扫描该位置的所有java文件生成mapper实例
@MapperScan("com.bupt317.study.lab_manager.mapper")
public class LabManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabManagerApplication.class, args);
    }
}
