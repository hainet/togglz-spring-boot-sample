package com.hainet.togglz.spring.boot.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.jdbc.JDBCStateRepository;

import javax.sql.DataSource;

@Configuration
public class TogglzConfig {

    @Bean
    public StateRepository stateRepository(final DataSource dataSource) {
        return new JDBCStateRepository(dataSource);
    }
}
