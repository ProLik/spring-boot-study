package com.prolik.java.springbootstudy;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringBootStudyApplication {

	public static void main(String[] args) {
		///new SpringApplicationBuilder(SpringBootStudyApplication.class).bannerMode(Banner.Mode.OFF).run(args);
		SpringApplication.run(SpringBootStudyApplication.class, args);



	}

}
