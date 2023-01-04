package main;

import beans.helloworld;
import beans.helloworldko;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloworld hi1 = new helloworld(); 
		callMethod(hi1);
		
		helloworldko hi2 = new helloworldko(); 
		callMethod(hi2);
	}
	
	public static void callMethod(helloworld hi) {
		hi.sayHello();
	}
	
	public static void callMethod(helloworldko hi) {
		hi.sayHello();
	}
}

// project에서 class가 변경되면 object 생성 부분과 reference variable 부분 모두 수정해야 함
// 유지보수에서 불편해짐