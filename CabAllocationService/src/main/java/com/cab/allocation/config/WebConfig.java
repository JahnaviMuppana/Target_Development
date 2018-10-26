package com.cab.allocation.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.cab.allocation.controller", "com.cab.allocation.service"})
@EntityScan(basePackages = {"com.cab.allocation.dao"})
@EnableJpaRepositories(basePackages = {"com.cab.allocation.dao"})
public class WebConfig {

}
