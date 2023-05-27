package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import beans.testBean4;
import beans.testBean5;
import beans.testBean6;
import config.beanConfigClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(beanConfigClass.class);
		
		testBean1 obj1 = ctx.getBean("obj1", testBean1.class);
		testBean2 obj2 = ctx.getBean("obj2", testBean2.class);
		
		System.out.println("-------------------------------------------");
		
		testBean3 obj3 = ctx.getBean("obj3", testBean3.class);
		System.out.printf("obj3.data1: %s\n", obj3.getData1());
		System.out.printf("obj3.data2: %s\n", obj3.getData2());
		
		System.out.println("-------------------------------------------");
		
		testBean4 obj4 = ctx.getBean("obj4", testBean4.class);
		System.out.printf("obj4.data1: %s\n", obj4.getData1());
		System.out.printf("obj4.data2: %s\n", obj4.getData2());
		
		System.out.println("-------------------------------------------");
		
		testBean5 obj5 = ctx.getBean("obj5", testBean5.class);
		System.out.printf("obj5.data1: %s\n", obj5.getData1());
		System.out.printf("obj5.data2: %s\n", obj5.getData2());
		
		System.out.println("-------------------------------------------");
		
		testBean6 obj6 = ctx.getBean("obj6", testBean6.class);
		System.out.printf("obj6.data1: %s\n", obj6.getData100());
		System.out.printf("obj6.data2: %s\n", obj6.getData200());
		
		System.out.println("-------------------------------------------");
		
		ctx.close();
	}

}
