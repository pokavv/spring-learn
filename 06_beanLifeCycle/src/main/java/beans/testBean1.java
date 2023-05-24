package beans;

public class testBean1 {
	
	public testBean1() {
		System.out.println("testBean의 생성자 1입니다.");
	}
	
	public void bean1_init() {
		System.out.println("testBean1의 init method");
	}
	
	public void bean1_destroy() {
		System.out.println("testBean1의 destroy method");
	}
}
