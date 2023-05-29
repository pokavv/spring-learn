package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import config.beanConfigClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(beanConfigClass.class);
		
		testBean1 t1 = ctx.getBean(testBean1.class);
		
		System.out.printf("t1.data1 : %s\n", t1.getData1());
		System.out.printf("t1.data2 : %s\n", t1.getData2());
		System.out.printf("t1.data3 : %s\n", t1.getData3());
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n", t1.getData5());
		
		System.out.println("---------------------------------------------");
		
		testBean2 t2 = ctx.getBean(testBean2.class);
		
		System.out.printf("t2.data1 : %s\n", t2.getData1());
		System.out.printf("t2.data2 : %s\n", t2.getData2());
		System.out.printf("t2.data3 : %s\n", t2.getData3());
		System.out.printf("t2.data4 : %s\n", t2.getData4());
		
		System.out.println("---------------------------------------------");
		
		testBean3 java2 = ctx.getBean("java2", testBean3.class);
		System.out.printf("java2.data1 : %d\n", java2.getData1());
		System.out.printf("java2.data2 : %s\n", java2.getData2());
		System.out.printf("java2.data3 : %s\n", java2.getData3());
		System.out.printf("java2.data4 : %s\n", java2.getData4());
		
		ctx.close();
	}

}
