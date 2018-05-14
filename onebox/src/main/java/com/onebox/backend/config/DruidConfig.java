package com.onebox.backend.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ServletComponentScan
public class DruidConfig {

	@Bean
	@ConfigurationProperties(prefix = "druid")
	public DataSource druidSource() {
		System.out.println("<<<<<<<<<<<<<<<<<Druid-DataSource");
		return new DruidDataSource();
	}
}
