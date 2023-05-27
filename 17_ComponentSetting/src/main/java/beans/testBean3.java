package beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// getBean 메서드를 호출할 때 객체가 생성된다.
// Singleton
@Lazy
public class testBean3 {

	public testBean3() {
		System.out.println("testBean3의 생성자");
	}
}
