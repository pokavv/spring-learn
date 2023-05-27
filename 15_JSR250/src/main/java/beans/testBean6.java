package beans;

import javax.annotation.Resource;

public class testBean6 {

	@Resource(name = "data1")
	private dataBean1 data100;
	
	@Resource(name = "data2")
	private dataBean2 data200;

	///////////////////////////////////////////
	
	public dataBean1 getData100() {
		return data100;
	}

	public dataBean2 getData200() {
		return data200;
	}
	
}
