package com.ning.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.ning.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
