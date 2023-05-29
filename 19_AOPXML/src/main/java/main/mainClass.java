package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean bean1 = ctx.getBean("xml1", testBean.class);
		
		int a1 = bean1.method1();
		System.out.printf("a1: %d\n", a1);
		
		ctx.close();
	}

}
