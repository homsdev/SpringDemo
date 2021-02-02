package com.homsdev.DemoSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Samsumg getPhone() {
		return new Samsumg();
	}
	
	@Bean
	public CPU getCPU() {
		return new SnapDragon();
	}
	
}
