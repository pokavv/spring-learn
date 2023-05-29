package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.testBean1;
import beans.testBean2;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean1 xml1 = ctx.getBean("xml1", testBean1.class);
		testBean2 xml2 = ctx.getBean("xml2", testBean2.class);
		beans2.testBean1 xml3 = ctx.getBean("xml3", beans2.testBean1.class);
		
		xml1.method1();
		
		System.out.println("------------------");
		
		xml1.method1(100);
		
		System.out.println("------------------");
		
		xml1.method1("문자열");
		
		System.out.println("------------------");
		
		xml1.method1(100, 200);
		
		System.out.println("------------------");
		
		xml1.method1(100, "문자열");
		
		System.out.println("------------------");
		
		xml1.method2();
		
		System.out.println("=============================");
		
		xml2.method1();
		
		System.out.println("=============================");
		
		xml3.method1();
		
		System.out.println("=============================");
		
		int a1 = xml1.method3();
		System.out.printf("a1: %d\n", a1);
		
		ctx.close();
	}

}
