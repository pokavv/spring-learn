package beans;

import org.springframework.stereotype.Component;

// IoC 컨테이너가 만들어질 때 자동으로 객체가 생성된다.
// 객체의 주소값을 가져올 때 이름을 통해 가져올 수 있다.
// Singleton
@Component("t3") // 지정
public class testBean2 {

	public testBean2() {
		System.out.println("testBean2의 생성자");
	}
}
