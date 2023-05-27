package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import beans.testBean4;
import beans.testBean5;
import config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		testBean1 t1 = ctx.getBean(testBean1.class);
		System.out.printf("t1 : %s\n", t1);
		
		testBean1 t2 = ctx.getBean(testBean1.class);
		System.out.printf("t2 : %s\n", t2);
		
		System.out.println("---------------------------------");
		
		testBean2 t3 = ctx.getBean("t3", testBean2.class);
		System.out.printf("t3 : %s\n", t3);
		
		testBean2 t4 = ctx.getBean("t3", testBean2.class);
		System.out.printf("t4 : %s\n", t4);
		
		System.out.println("---------------------------------");
		
		testBean2 t5 = ctx.getBean("t5", testBean2.class);
		System.out.printf("t5 : %s\n", t5);
		
		testBean2 t6 = ctx.getBean("t6", testBean2.class);
		System.out.printf("t6 : %s\n", t6);
		
		System.out.println("---------------------------------");
		
		testBean3 t7 = ctx.getBean(testBean3.class);
		System.out.printf("t7 : %s\n", t7);
		
		testBean3 t8 = ctx.getBean(testBean3.class);
		System.out.printf("t8 : %s\n", t8);
		
		System.out.println("---------------------------------");
		
		testBean4 t9 = ctx.getBean(testBean4.class);
		System.out.printf("t9 : %s\n", t9);
		
		testBean4 t10 = ctx.getBean(testBean4.class);
		System.out.printf("t10 : %s\n", t10);
		
		System.out.println("---------------------------------");
		
		testBean5 t11 = ctx.getBean(testBean5.class);
		System.out.printf("t11 : %s\n", t11);
		
		ctx.close();
	}

}
