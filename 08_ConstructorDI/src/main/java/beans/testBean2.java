package beans;

public class testBean2 {

	private dataBean data1;
	private dataBean data2;
	
	public testBean2(dataBean data1, dataBean data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void printData() {
		System.out.printf("data1 : %s\n", data1);
		System.out.printf("data2 : %s\n", data2);
	}
}
