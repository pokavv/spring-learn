package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean1;
import beans.testBean2;
import beans.testBean3;
import beans.testBean4;
import config.beanConfigClass;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// xml 사용하는 방식
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean1 xml1 = ctx1.getBean("xml1", testBean1.class);
		System.out.printf("xml1: %s\n", xml1);
		
		testBean1 xml11 = ctx1.getBean("xml1", testBean1.class);
		System.out.printf("xml1.1: %s\n", xml11); // Singleton이기 때문에 똑같은 객체 주소값 반환
		
		System.out.println("----------------------------");
		
		testBean2 xml2 = ctx1.getBean("xml2", testBean2.class);
		System.out.printf("xml2: %s\n", xml2);
		
		testBean2 xml21 = ctx1.getBean("xml2", testBean2.class);
		System.out.printf("xml2.1: %s\n", xml21); // Singleton이기 때문에 똑같은 객체 주소값 반환
		
		System.out.println("----------------------------");
		
		testBean3 xml3 = ctx1.getBean("xml3", testBean3.class);
		System.out.printf("xml3: %s\n", xml3);
		
		testBean3 xml31 = ctx1.getBean("xml3", testBean3.class);
		System.out.printf("xml31: %s\n", xml31); // Prototype이기 때문에 각 객체마다 각각의 주소값 반환

		System.out.println("----------------------------");
		
		testBean4 xml4= ctx1.getBean(testBean4.class);
		System.out.printf("xml4: %s\n", xml4);
		
		ctx1.close();
		
		System.out.println("================================");
		
		// java 파일 사용하는 방식
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(beanConfigClass.class);
		
		testBean1 java1 = ctx2.getBean("java1", testBean1.class);
		System.out.printf("java1: %s\n", java1);
		
		testBean1 java11 = ctx2.getBean("java1", testBean1.class);
		System.out.printf("java1.1: %s\n", java11); // Singleton이기 때문에 똑같은 객체 주소값 반환
		
//		testBean1 java2 = ctx2.getBean("java2", testBean1.class); 
			// Bean name이 달라서 오류발생
//		System.out.printf("java2: %s\n", java2);
		
		testBean1 userConfigBean = ctx2.getBean("userConfigBean", testBean1.class);
		System.out.printf("userConfigBean: %s\n", userConfigBean);
		
		System.out.println("----------------------------");
		
		testBean2 java3 = ctx2.getBean("java3", testBean2.class);
		System.out.printf("java3: %s\n", java3);
		
		testBean2 java31 = ctx2.getBean("java3", testBean2.class);
		System.out.printf("java31: %s\n", java31); // Singleton이기 때문에 똑같은 객체 주소값 반환
		
		System.out.println("----------------------------");
		
		testBean3 java4 = ctx2.getBean("java4", testBean3.class);
		System.out.printf("java4: %s\n", java4);
		
		testBean3 java41 = ctx2.getBean("java4", testBean3.class);
		System.out.printf("java41: %s\n", java41); // Prototype이기 때문에 각 객체마다 각각의 주소값 반환
		
		System.out.println("----------------------------");
		
		testBean4 java5 = ctx2.getBean(testBean4.class);
		System.out.printf("java5: %s\n", java5);
		
		ctx2.close();
	}

}
