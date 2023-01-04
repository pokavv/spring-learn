package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.helloworld;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// beans.xml file loading
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		// xml에 정의한 bean 객체의 주소값을 가져온다
		helloworld hi = (helloworld)ctx.getBean("hi-kor");
		callMethod(hi);
		
		helloworld hi2 = ctx.getBean("hi-eng", helloworld.class);
		callMethod(hi2);
		
		ctx.close();
	}
	
	public static void callMethod(helloworld hi) {
		hi.sayHello();
	}
}
