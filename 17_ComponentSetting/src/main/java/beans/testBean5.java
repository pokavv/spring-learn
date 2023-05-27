package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class testBean5 {

	public testBean5() {
		System.out.println("testBean5의 생성자");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init 메서드가 호출되었습니다.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy 메서드가 호출되었습니다.");
	}
}
