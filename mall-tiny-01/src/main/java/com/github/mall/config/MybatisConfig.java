package com.github.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis配置类
 * */
@Configuration
@MapperScan("com.github.mall.mbg.mapper")
public class MybatisConfig {

}
