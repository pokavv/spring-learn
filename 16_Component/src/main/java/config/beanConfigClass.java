package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.testBean1;
import beans.testBean2;
import beans2.testBean4;

@Configuration
//지정된 패키지의 Bean 클래스들의 어노테이션을 분석하여 Bean을 등록하라고 지정한다.
@ComponentScan(basePackages = "beans2")
@ComponentScan(basePackages = "beans3")
public class beanConfigClass {

	@Bean
	public testBean1 java1() {
		return new testBean1();
	}
	
	@Bean
	public testBean2 java2() {
		return new testBean2();
	}
	
	@Bean
	public testBean2 java3() {
		return new testBean2();
	}
	
	@Bean
	public testBean4 java100() {
		return new testBean4();
	}
	
	@Bean
	public testBean4 java200() {
		return new testBean4();
	}
}
