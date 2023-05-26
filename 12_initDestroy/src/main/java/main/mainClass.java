package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean1;
import config.beanConfigClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean1 xml1 = ctx1.getBean("xml1", testBean1.class);
		
		ctx1.close();
		
		System.out.println("==========================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(beanConfigClass.class);
		
		testBean1 java1 = ctx2.getBean("java1", testBean1.class);
		
		ctx2.close();
	}

}
