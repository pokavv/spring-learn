package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import beans.dataBean1;
import beans.dataBean2;
import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import beans.testBean4;
import beans.testBean5;
import beans.testBean6;

@Configuration
public class beanConfigClass {

	@Bean(initMethod = "init1", destroyMethod = "destroy1")
	@Lazy
	public testBean1 obj1() {
		return new testBean1();
	}
	
	@Bean
	@Lazy
	public testBean2 obj2() {
		return new testBean2();
	}
	
	@Bean
	public dataBean1 data1() {
		return new dataBean1();
	}
	
	@Bean
	public dataBean2 data2() {
		return new dataBean2();
	}
	
	@Bean
	public testBean3 obj3() {
		return new testBean3();
	}
	
	@Bean
	public testBean4 obj4() {
		return new testBean4();
	}
	
	@Bean
	public testBean5 obj5() {
		return new testBean5();
	}
	
	@Bean
	public testBean6 obj6() {
		return new testBean6();
	}
}
