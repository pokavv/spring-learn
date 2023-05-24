package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import beans.testBean4;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean1 t1 = ctx.getBean("t1", testBean1.class);
		System.out.printf("t1 : %s\n", t1);
		
		System.out.println("---------------------------------------");
		
		testBean2 t2 = ctx.getBean("t2", testBean2.class);
		System.out.printf("t2 : %s\n", t2);
		
		System.out.println("---------------------------------------");
		
		testBean3 t3 = ctx.getBean("t3", testBean3.class);
		System.out.printf("t3 : %s\n", t3);
		
		System.out.println("---------------------------------------");
		
		testBean4 t4 = ctx.getBean("t4", testBean4.class);
		System.out.printf("t4 : %s\n", t4);
		
		System.out.println("---------------------------------------");
		ctx.close();
	}

}
