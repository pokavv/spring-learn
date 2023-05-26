package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import config.beanConfigClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean1 xml1 = ctx1.getBean("xml1", testBean1.class);
		System.out.printf("xml1.data1: %d\n", xml1.getData1());
		System.out.printf("xml1.data2: %s\n", xml1.getData2());
		System.out.printf("xml1.data3: %s\n", xml1.getData3());
		
		System.out.println("--------------------------------------");
		
		testBean1 xml2 = ctx1.getBean("xml2", testBean1.class);
		System.out.printf("xml2.data1: %d\n", xml2.getData1());
		System.out.printf("xml2.data2: %s\n", xml2.getData2());
		System.out.printf("xml2.data3: %s\n", xml2.getData3());
		
		System.out.println("--------------------------------------");
		
		testBean2 xml3 = ctx1.getBean("xml3", testBean2.class);
		System.out.printf("xml3.data1: %s\n", xml3.getData1());
		System.out.printf("xml3.data2: %s\n", xml3.getData2());
		
		System.out.println("--------------------------------------");
		
		testBean3 xml4 = ctx1.getBean("xml4", testBean3.class);
		System.out.printf("xml4.data1: %s\n", xml4.getData1());
		System.out.printf("xml4.data2: %s\n", xml4.getData2());
		
		ctx1.close();
		
		System.out.println("======================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(beanConfigClass.class);
		
		testBean1 java1 = ctx2.getBean("java1", testBean1.class);
		System.out.printf("java1.data1: %d\n", java1.getData1());
		System.out.printf("java1.data2: %s\n", java1.getData2());
		System.out.printf("java1.data3: %s\n", java1.getData3());
		
		System.out.println("---------------------------------------");
		
		testBean1 java2 = ctx2.getBean("java2", testBean1.class);
		System.out.printf("java2.data1: %d\n", java2.getData1());
		System.out.printf("java2.data2: %s\n", java2.getData2());
		System.out.printf("java2.data3: %s\n", java2.getData3());
		
		System.out.println("---------------------------------------");
		
		testBean2 java3 = ctx2.getBean("java3", testBean2.class);
		System.out.printf("java3.data1: %s\n", java3.getData1());
		System.out.printf("java3.data2: %s\n", java3.getData2());
		
		System.out.println("---------------------------------------");
		
		testBean3 java4 = ctx2.getBean("java4", testBean3.class);
		System.out.printf("java4.data1: %s\n", java4.getData1());
		System.out.printf("java4.data2: %s\n", java4.getData2());
		
		ctx2.close();
	}

}
