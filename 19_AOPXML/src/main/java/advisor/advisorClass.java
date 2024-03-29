package advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class advisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출1");
		
		// 원래의 method 호출
		Object obj = pjp.proceed();
		
		System.out.println("arountMethod 호출2");
		
		return obj;
	}
	
	// afterReturningMethod는 정상적일때만 호출
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	// afterThrowingMethod는 예외 발생시에 호출
	public void afterThrowingMethod(Throwable e1) { // 주입 객체는 e1
		System.out.println("afterThrowingMethod 호출");
		System.out.println(e1);
	}
}
