package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.testBean2;

@Configuration
@ComponentScan(basePackages = "beans")
public class BeanConfigClass {

	@Bean
	public testBean2 t5() {
		return new testBean2();
	}
	
	@Bean
	public testBean2 t6() {
		return new testBean2();
	}
}
