package main;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import beans.testBean;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
	}
	// BeanFactory - package 내부
	public static void test1() {
		ClassPathResource res = new ClassPathResource("config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		testBean t1 = factory.getBean("t1", testBean.class);
		System.out.printf("BeanFactory 패키지 내부 t1: %s\n", t1); // 객체 정보 출력
		
		testBean t2 = factory.getBean("t1", testBean.class);
		System.out.printf("BeanFactory 패키지 내부 t2: %s\n", t2); // 객체 정보 동일
	}
	
	// BeanFactory - package 외부
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		testBean t1 = factory.getBean("t2", testBean.class);
		System.out.printf("BeanFactory 패키지 외부 t1: %s\n", t1);
		
		testBean t2 = factory.getBean("t2", testBean.class);
		System.out.printf("BeanFactory 패키지 외부 t2: %s\n", t2);
	}
	
	// ApplicationContext - 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean t1 = ctx.getBean("t1", testBean.class);
		System.out.printf("ApplicationContext 패키지 내부 t1: %s\n", t1);
		
		testBean t2 = ctx.getBean("t1", testBean.class);
		System.out.printf("ApplicationContext 패키지 내부 t2: %s\n", t2);
		
		ctx.close();
	}
	
	// ApplicationContext - 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		testBean t1 = ctx.getBean("t2", testBean.class);
		System.out.printf("ApplicationContext 패키지 외부 t1: %s\n", t1);
		
		testBean t2 = ctx.getBean("t2", testBean.class);
		System.out.printf("ApplicationContext 패키지 외부 t2: %s\n", t2);
		
		ctx.close();
	}
}
