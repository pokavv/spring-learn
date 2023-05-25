package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import beans.testBean4;

@Configuration // beans.xml 역할을 함
public class beanConfigClass {

	@Bean // bean 정의
	public testBean1 java1() {
		testBean1 t1 = new testBean1();
		return t1;
	}
	
	@Bean(name = "userConfigBean")
	public testBean1 java2() {
		testBean1 t1 = new testBean1();
		return t1;
	}
	
	@Bean
	@Lazy
	public testBean2 java3() {
		testBean2 t2 = new testBean2();
		return t2;
	}
	
	@Bean
	@Scope("prototype")
	public testBean3 java4() {
		testBean3 t3 = new testBean3();
		return t3;
	}
	
	@Bean
	public testBean4 java5() {
		testBean4 t4 = new testBean4();
			return t4;
	}
	
	@Bean
	public testBean4 java6() {
		testBean4 t4 = new testBean4();
			return t4;
	}
}
