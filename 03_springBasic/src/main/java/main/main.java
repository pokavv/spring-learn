package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.helloWorld;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// beans.xml loading
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		// xml에 정의한 bean 객체의 주소값을 가져온다.
		helloWorld hello1 = (helloWorld)ctx.getBean("hello-eng");
		callMethod(hello1);
		
		helloWorld hello2 = ctx.getBean("hello-kor", helloWorld.class);
		callMethod(hello2);
		
		ctx.close();
	}

	public static void callMethod(helloWorld hello) {
		hello.sayHello();
	}
}
