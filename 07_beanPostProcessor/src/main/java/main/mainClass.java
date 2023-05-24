package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean1;
import beans.testBean2;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean1 t1 = ctx.getBean("t1", testBean1.class);
		System.out.printf("t1 : %s\n", t1);
		
		System.out.println("------------------------------");
		
		testBean2 t2 = ctx.getBean("t2", testBean2.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();
	}

}
