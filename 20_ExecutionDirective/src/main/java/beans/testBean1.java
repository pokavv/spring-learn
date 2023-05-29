package beans;

public class testBean1 {

	public void method1() {
		System.out.println("beans.testBean1.method1()");
	}
	
	public void method1(int a1) {
		System.out.println("beans.testBean1.method1(int a1)");
	}
	
	public void method1(String a2) {
		System.out.println("beans.testBean1.method1(java.lang.String)");
	}
	
	public void method1(int a1, int a2) {
		System.out.println("beans.testBean1.method1(int, int)");
	}
	
	public void method1(int a1, String a2) {
		System.out.println("beans.testBean1.method1(int, String)");
	}
	
	public void method2() {
		System.out.println("beans.testBean1.method2()");
	}
	
	public int method3() {
		System.out.println("int beans.testBean1.method3()");
		return 100;
	}
}
