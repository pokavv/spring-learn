package beans;

import javax.annotation.Resource;

public class testBean5 {

	// 변수의 이름과 동일한 이름의 Bean이 주입된다.
	@Resource
	private dataBean1 data1;
	
	@Resource
	private dataBean2 data2;

	////////////////////////////////////
	
	public dataBean1 getData1() {
		return data1;
	}

	public dataBean2 getData2() {
		return data2;
	}
	
	
}
