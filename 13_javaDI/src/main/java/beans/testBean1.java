package beans;

public class testBean1 {

	private int data1;
	private String data2;
	private dataBean1 data3;
	
	public testBean1() {
		
	}
	
	public testBean1(int data1, String data2, dataBean1 data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	///////////////////////////////////////
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	////////////////////////////////////////
	
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	
	/////////////////////////////////////////
	
	public dataBean1 getData3() {
		return data3;
	}
	public void setData3(dataBean1 data3) {
		this.data3 = data3;
	}
	
	
}
