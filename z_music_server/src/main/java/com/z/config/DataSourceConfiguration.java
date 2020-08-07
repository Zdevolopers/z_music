package com.z.config;

import com.z.constant.BaseConstant;
import com.z.utils.EncryptionUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author zming
 * @version V1.0
 * @description
 * @date 2020/8/5 0005 11:51
 **/
@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class DataSourceConfiguration {

    @Resource
    private DataSourceProperties properties;

    @Bean
    public DataSource dataSource() {
        HikariConfig dataSource = new HikariConfig();
        dataSource.setUsername(properties.getUsername());
        dataSource.setJdbcUrl(properties.getUrl());
        //解密
        String decrypt = EncryptionUtil.decrypt(properties.getPassword(), BaseConstant.MYSQL_KEY);
        dataSource.setPassword(decrypt);
        return new HikariDataSource(dataSource);
    }

}
