package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class testBean4 {

	@Autowired
	@Qualifier("data1")
	private dataBean1 data1;
	
	@Autowired
	@Qualifier("data2")
	private dataBean2 data2;

	////////////////////////////////////////////
	
	public dataBean1 getData1() {
		return data1;
	}

	public dataBean2 getData2() {
		return data2;
	}
	
		
}
