package beans;

public class testBean3 {
	
	public testBean3() {
		System.out.println("testBean의 생성자 3입니다.");
	}
	
	public void default_init() {
		System.out.println("testBean3의 default_init method");
	}
	
	public void default_destroy() {
		System.out.println("testBean3의 default_destroy method");
	}

	public void bean3_init() {
		System.out.println("testBean3의 init method");
	}

	public void bean3_destroy() {
		System.out.println("testBean3의 destroy method");
	}
}
