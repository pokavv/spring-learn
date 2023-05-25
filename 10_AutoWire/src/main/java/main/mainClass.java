package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean;
import beans.testBean2;
import beans.testBean3;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean obj1 = ctx.getBean("obj1", testBean.class);
		System.out.printf("obj1.data1: %s\n", obj1.getData1());
		System.out.printf("obj1.data1: %s\n", obj1.getData2());
		
		System.out.println("--------------------------------------------");
		
		testBean obj2 = ctx.getBean("obj2", testBean.class);
		System.out.printf("obj2.data1: %s\n", obj2.getData1());
		System.out.printf("obj2.data2: %s\n", obj2.getData2());
		
		
		System.out.println("--------------------------------------------");
		
		testBean2 obj3  = ctx.getBean("obj3", testBean2.class);
		System.out.printf("obj3.data1: %s\n", obj3.getData1());
		System.out.printf("obj3.data2: %s\n", obj3.getData2());
		
		System.out.println("--------------------------------------------");
		
		testBean3 obj4 = ctx.getBean("obj4", testBean3.class);
		System.out.printf("obj4.data1: %d\n", obj4.getData1());
		System.out.printf("obj4.data2: %s\n", obj4.getData2());
		System.out.printf("obj4.data3: %s\n", obj4.getData3());
		System.out.printf("obj4.data4: %s\n", obj4.getData4());
		
		System.out.println("--------------------------------------------");
		
		testBean3 obj5 = ctx.getBean("obj5", testBean3.class);
		System.out.printf("obj5.data1: %d\n", obj5.getData1());
		System.out.printf("obj5.data2: %s\n", obj5.getData2());
		System.out.printf("obj5.data3: %s\n", obj5.getData3());
		System.out.printf("obj5.data4: %s\n", obj5.getData4());
		
		System.out.println("--------------------------------------------");
		
		testBean3 obj6 = ctx.getBean("obj6", testBean3.class);
		System.out.printf("obj6.data1: %d\n", obj6.getData1());
		System.out.printf("obj6.data2: %s\n", obj6.getData2());
		System.out.printf("obj6.data3: %s\n", obj6.getData3());
		System.out.printf("obj6.data4: %s\n", obj6.getData4());
		
		System.out.println("--------------------------------------------");
		
		testBean3 obj7 = ctx.getBean("obj7", testBean3.class);
		System.out.printf("obj7.data1: %d\n", obj7.getData1());
		System.out.printf("obj7.data2: %s\n", obj7.getData2());
		// 객체는 자동 주입 발생
		System.out.printf("obj7.data3: %s\n", obj7.getData3());
		System.out.printf("obj7.data4: %s\n", obj7.getData4());
		
		System.out.println("--------------------------------------------");
		
		testBean obj8 = ctx.getBean("obj8", testBean.class);
		System.out.printf("obj8.data1: %s\n", obj8.getData1());
		System.out.printf("obj8.data2: %s\n", obj8.getData2());

		System.out.println("--------------------------------------------");
		
		testBean obj9 = ctx.getBean("obj9", testBean.class);
		System.out.printf("obj9.data1: %s\n", obj9.getData1());
		System.out.printf("obj9.data2: %s\n", obj9.getData2());
		
		ctx.close();
	}

}

// 자동주입은 객체 타입만 가능