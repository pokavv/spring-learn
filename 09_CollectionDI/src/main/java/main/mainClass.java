package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.testBean;
import beans.dataBean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		testBean t1 = ctx.getBean("t1", testBean.class);
		
		List<String> list1 = t1.getList1();
		for (String str: list1) {
			System.out.printf("list1: %s\n", str);
		}
		
		System.out.println("-------------------------------------------");
		
		List<Integer> list2 = t1.getList2();
		for (int value: list2) {
			System.out.printf("list2: %d\n", value);
		}
		
		System.out.println("-------------------------------------------");
		
		List<dataBean> list3 = t1.getList3();
		for (dataBean obj: list3) {
			System.out.printf("list3: %s\n", obj);
		}
		
		System.out.println("-------------------------------------------");
		
		Set<String> set1 = t1.getSet1();
		Set<Integer> set2 = t1.getSet2();
		Set<dataBean> set3 = t1.getSet3();
		
		for (String str: set1) {
			System.out.printf("set1: %s\n", str);
		}

		System.out.println("-------------------------------------------");
		
		for (int value: set2) {
			System.out.printf("set2: %d\n", value);
		}

		System.out.println("-------------------------------------------");
		
		for (dataBean obj: set3) {
			System.out.printf("set3: %s\n", obj);
		}

		System.out.println("-------------------------------------------");
		
		Map<String, Object> map1 = t1.getMap1();
		
		String k1 = (String)map1.get("k1");
		int k2 = (Integer)map1.get("k2");
		dataBean k3 = (dataBean)map1.get("k3");
		dataBean k4 = (dataBean)map1.get("k4");
		List<String> k5 = (List<String>)map1.get("k5");
		
		System.out.printf("k1: %s\n", k1);
		System.out.printf("k2: %d\n", k2);
		System.out.printf("k3: %s\n", k3);
		System.out.printf("k4: %s\n", k4);
		
		for (String str: k5) {
			System.out.printf("k5: %s\n", str);
		}

		System.out.println("-------------------------------------------");
		
		Properties prop1 = t1.getProp1();
		
		String p1 = prop1.getProperty("p1");
		String p2 = prop1.getProperty("p2");
		String p3 = prop1.getProperty("p3");
		
		System.out.printf("p1: %s\n", p1);
		System.out.printf("p2: %s\n", p2);
		System.out.printf("p3: %s\n", p3);

		System.out.println("-------------------------------------------");
		
		ctx.close();
	}

}
