package beans;

public class testBean3 {

	private int data1;
	private String data2;
	
	private dataBean2 data3;
	private dataBean2 data4;
	
	public testBean3(dataBean2 data3, dataBean2 data4) {
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public testBean3(int data1, String data2, dataBean2 data3, dataBean2 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	//////////////////////////////////////////
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	//////////////////////////////////////////
	
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	
	//////////////////////////////////////////
	
	public dataBean2 getData3() {
		return data3;
	}
	public void setData3(dataBean2 data3) {
		this.data3 = data3;
	}
	
	//////////////////////////////////////////
	
	public dataBean2 getData4() {
		return data4;
	}
	public void setData4(dataBean2 data4) {
		this.data4 = data4;
	}
	
	
}
