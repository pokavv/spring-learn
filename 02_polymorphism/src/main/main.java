package main;

import beans.helloworld;
import beans.helloworldEn;
import beans.helloworldKo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloworld hi1 = new helloworldEn();
		callMethod(hi1);
		
		helloworld hi2 = new helloworldKo();
		callMethod(hi2);
	}
	
	public static void callMethod(helloworld hi) {
		hi.sayHello();
	}
}

// polymorphism을 사용하면 class가 변경되었을 때 reference variable 부분은 수정하지 않아도 되지만
// object를 생성하는 부분의 code는 변경되어야 함.