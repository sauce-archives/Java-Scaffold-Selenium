package com.saucelabs.saucedemo.environment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan(value = "com.saucelabs.saucedemo")
public class SauceDemoConfig {
}