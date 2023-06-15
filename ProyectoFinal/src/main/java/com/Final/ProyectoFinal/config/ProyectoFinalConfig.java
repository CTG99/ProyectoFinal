package com.Final.ProyectoFinal.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ProyectoFinalConfig {

//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

	/*
	 * DataSource ds;
	 * 
	 * @Bean public JdbcUserDetailsManager jdbcUserDetailsManager(DataSource ds) {
	 * 
	 * JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
	 * jdbcUserDetailsManager.setDataSource(ds); return jdbcUserDetailsManager; };
	 * 
	 * @Bean public JdbcTemplate getJdbcTemplate() { return new JdbcTemplate(ds); }
	 */
}
