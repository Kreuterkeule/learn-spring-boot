package com.kreuterkeule.learnspringboot;

import com.fasterxml.jackson.annotation.JsonFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Configuration
@SpringBootApplication
public class LearnSpringBootApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(LearnSpringBootApplication.class);

	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LearnSpringBootApplication.class);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootApplication.class, args);
		logger.info("{LOGGER}: Application [learn-spring-boot] started");
	}

}
