package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import beans.testBean1;

@Configuration
public class beanConfigClass {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Lazy
	public testBean1 java1() {
		return new testBean1();
	}
}
