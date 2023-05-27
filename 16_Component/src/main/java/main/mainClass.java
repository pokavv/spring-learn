package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean1;
import beans.testBean2;
import beans2.testBean3;
import beans2.testBean4;
import beans3.testBean5;
import config.beanConfigClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config/beans.xml");
		
		System.out.println("--------------");
		
		testBean1 xml1 = ctx1.getBean(testBean1.class);
		System.out.printf("xml1: %s\n", xml1);
		
		testBean2 xml2 = ctx1.getBean("xml2", testBean2.class);
		System.out.printf("xml2: %s\n", xml2);
		
		testBean2 xml3 = ctx1.getBean("xml3", testBean2.class);
		System.out.printf("xml3: %s\n", xml3);
		
		System.out.println("--------------");
		
		testBean3 xml4 = ctx1.getBean(testBean3.class);
		System.out.printf("xml4: %s\n", xml4);
		
		System.out.println("--------------");
		
		testBean4 xml5 = ctx1.getBean("bean4", testBean4.class);
		System.out.printf("xml5: %s\n", xml5);
		
		testBean4 xml100 = ctx1.getBean("xml100", testBean4.class);
		System.out.printf("xml100: %s\n", xml100);
		
		testBean4 xml200 = ctx1.getBean("xml200", testBean4.class);
		System.out.printf("xml200: %s\n", xml200);
		
		System.out.println("--------------");
		
		testBean5 xml500 = ctx1.getBean(testBean5.class);
		System.out.printf("xml500: %s\n", xml500);
		
		System.out.println("--------------");
		
		ctx1.close();
		
		System.out.println("===========================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(beanConfigClass.class);
		
		System.out.println("--------------");
		
		testBean1 java1 = ctx2.getBean(testBean1.class);
		System.out.printf("java1: %s\n", java1);
		
		testBean2 java2 = ctx2.getBean("java2", testBean2.class);
		System.out.printf("java2: %s\n", java2);
		
		testBean2 java3 = ctx2.getBean("java3" ,testBean2.class);
		System.out.printf("java3: %s\n", java3);
		
		System.out.println("--------------");
		
		testBean3 java4 = ctx2.getBean(testBean3.class);
		System.out.printf("java4: %s\n", java4);
		
		System.out.println("--------------");
		
		testBean4 java5 = ctx2.getBean("bean4", testBean4.class);
		System.out.printf("java5: %s\n", java5);
		
		testBean4 java100 = ctx2.getBean("java100", testBean4.class);
		System.out.printf("java100: %s\n", java100);
		
		testBean4 java200 = ctx2.getBean("java200", testBean4.class);
		System.out.printf("java200: %s\n", java200);
		
		System.out.println("--------------");
		
		testBean5 java500 = ctx2.getBean(testBean5.class);
		System.out.printf("java500: %s\n", java500);
		
		System.out.println("--------------");
		
		ctx2.close();
	}

}
