package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean;
import beans.testBean2;
import beans.dataBean;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean t1 = new testBean();
		t1.printData();

		System.out.println("----------------------");
		
		testBean t2 = new testBean(100);
		t2.printData();
		
		System.out.println("----------------------");
		
		testBean t3 = new testBean(11.11);
		t3.printData();
		
		System.out.println("----------------------");
		
		testBean t4 = new testBean("Hello World !!!!");
		t4.printData();
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		testBean t5 = new testBean(200, 22.22, "문자열입니다...");
		t5.printData();
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		testBean obj1 = ctx.getBean("obj1", testBean.class);
		obj1.printData();
		
		System.out.println("----------------------");

		testBean obj2 = ctx.getBean("obj2", testBean.class);
		obj2.printData();
		
		System.out.println("----------------------");

		testBean obj3 = ctx.getBean("obj3", testBean.class);
		obj3.printData();
		
		System.out.println("----------------------");

		testBean obj4 = ctx.getBean("obj4", testBean.class);
		obj4.printData();
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");

		testBean obj5 = ctx.getBean("obj5", testBean.class);
		obj5.printData();

		System.out.println("----------------------");
		
		dataBean d1 = new dataBean();
		dataBean d2 = new dataBean();
		
		testBean2 t200 = new testBean2(d1, d2);
		t200.printData();
		
		System.out.println("-----------------------");
		
		testBean2 obj8 = ctx.getBean("obj8", testBean2.class);
		obj8.printData();
		
		System.out.println("-----------------------");
		
		testBean2 obj9 = ctx.getBean("obj9", testBean2.class);
		obj9.printData();
		
		ctx.close();
	}

}
