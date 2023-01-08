package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
	// Singleton이기 때문에 여러번 호출하더라도 생성자는 하나만 존재
		// id=test1
		testBean t1 = ctx.getBean("test1", testBean.class);
		System.out.printf("t1: %s\n", t1);
		
		testBean t2 = ctx.getBean("test1", testBean.class);
		System.out.printf("t2: %s\n", t2);
		
		// id=test2
		testBean t3 = ctx.getBean("test2", testBean.class);
		System.out.printf("t3: %s\n", t3);
	
	// Prototype이기 때문에 여러번 호출하면 생성자가 여러번 생성
		// id=test3
		testBean t4 = ctx.getBean("test3", testBean.class);
		System.out.println("");
		System.out.println("test3");
		System.out.printf("t4: %s\n", t4);
		
		testBean t5 = ctx.getBean("test3", testBean.class);
		System.out.printf("t5: %s\n", t5);
		
		testBean t6 = ctx.getBean("test3", testBean.class);
		System.out.printf("t6: %s\n", t6);
		
		ctx.close();
	}

}
