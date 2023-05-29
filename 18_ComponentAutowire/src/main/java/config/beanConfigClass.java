package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.dataBean3;
import beans.dataBean4;
import beans.dataBean5;
import beans.testBean2;
import beans.testBean3;

@Configuration
@ComponentScan(basePackages = "beans")
public class beanConfigClass {

	@Bean
	public dataBean3 obj4() {
		return new dataBean3();
	}
	
	@Bean
	public dataBean3 obj5() {
		return new dataBean3();
	}
	
	@Bean
	public testBean3 java2() {
		testBean3 t2 = new testBean3(200, "문자열", new dataBean4(), new dataBean5());
		return t2;
	}
}
