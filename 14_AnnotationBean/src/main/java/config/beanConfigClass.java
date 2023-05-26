package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.dataBean1;
import beans.dataBean2;
import beans.testBean1;
import beans.testBean2;

@Configuration
public class beanConfigClass {

	@Bean
	public testBean1 java1() {
		return new testBean1();
	}
	
	@Bean
	public dataBean1 data_bean1() {
		return new dataBean1();
	}
	
	@Bean
	public dataBean2 obj4() {
		return new dataBean2();
	}
	
	@Bean
	public dataBean2 obj5() {
		return new dataBean2();
	}
	
	@Bean
	public testBean2 java2() {
		return new testBean2();
	}
}
