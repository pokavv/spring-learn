package beans;

public class testBean {

	private int data1;
	private double data2;
	private String data3;
	
	public testBean() {
		System.out.println("testBean의 기본생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public testBean(int data1) {
		System.out.println("testBean의 생성자: int 변수 1개");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public testBean(double data2) {
		System.out.println("testBean의 생성자: double 변수 1개");
		this.data1 = 0;
		this.data2 = data2;
		this.data3 = null;
	}
	
	
	public testBean(String data3) {
		System.out.println("testBean의 생성자: string 변수 1개");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = data3;
	}
	
	public testBean(int data1, double data2, String data3) {
		System.out.println("testBean의 생성자: 변수 3개");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	public void printData() {
		System.out.printf("data1: %d\n", data1);
		System.out.printf("data2: %f\n", data2);
		System.out.printf("data3: %s\n", data3);
	}
}
