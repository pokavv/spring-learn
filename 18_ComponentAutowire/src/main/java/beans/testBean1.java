package beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class testBean1 {

	@Autowired
	private dataBean1 data1;
	
	@Autowired
	@Qualifier("obj2")
	private dataBean2 data2;
	
	@Resource(name = "obj3")
	private dataBean3 data3;
	
	@Resource(name = "obj4")
	private dataBean3 data4;

	@Resource(name = "obj5")
	private dataBean3 data5;

	/////////////////////////////////////////
	
	public dataBean3 getData3() {
		return data3;
	}

	public dataBean1 getData1() {
		return data1;
	}

	public dataBean2 getData2() {
		return data2;
	}
	
	public dataBean3 getData4() {
		return data4;
	}

	public dataBean3 getData5() {
		return data5;
	}
}
