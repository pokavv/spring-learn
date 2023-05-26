package config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.dataBean1;
import beans.dataBean2;
import beans.dataBean3;
import beans.testBean1;
import beans.testBean2;
import beans.testBean3;

@Configuration
public class beanConfigClass {

	@Bean
	public testBean1 java1() {
		return new testBean1(200, "안녕하세요", new dataBean1());
	}
	
	@Bean
	public testBean1 java2() {
		testBean1 t1 = new testBean1();
		t1.setData1(400);
		t1.setData2("문자열");
		t1.setData3(new dataBean1());
		
		return t1;
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	
	@Bean
	public dataBean2 data1() {
		return new dataBean2();
	}
	
	@Bean dataBean2 data2() {
		return new dataBean2();
	}
	
	@Bean(autowire = Autowire.BY_NAME) // autowire = Autowire.BY_NAME (Deprecated)
	public testBean2 java3() {
		return new testBean2();
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	
	@Bean
	public dataBean3 data10() {
		return new dataBean3();
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public testBean3 java4() {
		return new testBean3();
	}
}
