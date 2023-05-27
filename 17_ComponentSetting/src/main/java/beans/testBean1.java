package beans;

import org.springframework.stereotype.Component;

// IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성된다.
// 타입을 통해 등록된 Bean 객체를 가져올 수 있다.
// Singleton : getBean 할때마다 같은 객체가 나옴

@Component // Bean 등록
public class testBean1 {

	public testBean1() {
		System.out.println("testBean1의 생성자");
	}
}
