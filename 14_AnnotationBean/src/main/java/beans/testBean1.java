package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class testBean1 {

	private int data1;
	private dataBean1 data2;

	// 자동 주입을 변수에 설정: 자동으로 setter 메서드가 추가되어 setter 메서드를 통해 주입받게 된다.
	@Autowired
	private dataBean1 data3;
	
	// 이름에 따라 자동 주입: Qualifier
	@Autowired
	@Qualifier("obj4")
	private dataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private dataBean2 data5;
	
	@Autowired(required = false) // 있으면 주입, 아니면 null
	@Qualifier("obj6") // Qualifier가 설정되있으면 이름을 따라감
	private dataBean2 data6;
	
	/////////////////////////////////
		
	public int getData1() {
		return data1;
	}
	
	@Required // 반드시 사용해야하는 property 정의: Spring 5.1이상부터는 deprecated or 자바 파일로 bean 등록하면 무시됨
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	/////////////////////////////////
	
	public dataBean1 getData2() {
		return data2;
	}
	
	@Autowired
	public void setData2(dataBean1 data2) {
		this.data2 = data2;
	}
	/////////////////////////////////

	public dataBean1 getData3() {
		return data3;
	}

	/////////////////////////////////
	
	public dataBean2 getData4() {
		return data4;
	}

	public dataBean2 getData5() {
		return data5;
	}

	public dataBean2 getData6() {
		return data6;
	}
}
