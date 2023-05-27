package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// getBean 메서드를 호출할 때마다 새로운 객체를 생성해 반환한다.
@Scope("prototype")
public class testBean4 {

	public testBean4() {
		System.out.println("testBean4의 생성자");
	}
}
