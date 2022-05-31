package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com/nt/dao")
public class PersistanceConfig {
	@Autowired
	private Environment env;

	//Using Spring's DriverManagerDataSource
	@Bean(name = "dmDS")
	public DataSource createDMDS() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
		return dataSource;

	}

	//Using Apache DBCP2 DataSource
	@Bean(name = "dbcpDS")
	public DataSource createDBCP2DS() {
		BasicDataSource dbcpDS = new BasicDataSource();
		dbcpDS.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
		dbcpDS.setUrl(env.getRequiredProperty("jdbc.url"));
		dbcpDS.setUsername(env.getRequiredProperty("jdbc.username"));
		dbcpDS.setPassword(env.getRequiredProperty("jdbc.password"));
		dbcpDS.setMinIdle(10);
		dbcpDS.setMaxTotal(100);
		dbcpDS.setMaxWaitMillis(30000);
		return dbcpDS;
	}

	//Using Apache DBCP2 DataSource
	@Bean(name = "hikaricpDS")
	public DataSource createHCPDS() {
		HikariDataSource hikaricpDS = new HikariDataSource();
		hikaricpDS.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
		hikaricpDS.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		hikaricpDS.setUsername(env.getRequiredProperty("jdbc.username"));
		hikaricpDS.setPassword(env.getRequiredProperty("jdbc.password"));
		hikaricpDS.setMinimumIdle(10);
		hikaricpDS.setMaximumPoolSize(100);
		hikaricpDS.setConnectionTimeout(30000);
		return hikaricpDS;
	}
}
