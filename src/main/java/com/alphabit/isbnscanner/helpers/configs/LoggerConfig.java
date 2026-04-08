package com.alphabit.isbnscanner.helpers.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {
    public static final Logger logger = LoggerFactory.getLogger(LoggerConfig.class);
}
