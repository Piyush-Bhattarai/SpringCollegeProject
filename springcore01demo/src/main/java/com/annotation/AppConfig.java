package com.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // starts spring
@ComponentScan(basePackages = {"com.annotation"})  // load bean from this package
public class AppConfig {
	

}
