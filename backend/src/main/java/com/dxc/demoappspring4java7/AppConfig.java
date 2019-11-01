package com.dxc.demoappspring4java7;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * AppConfig
 */
@Configuration
@EnableWebMvc
@ComponentScan( basePackages = { "com.dxc.demoappspring4java7.backend", "com.dxc.demoappspring4java7.model" } )
public class AppConfig {

    
}