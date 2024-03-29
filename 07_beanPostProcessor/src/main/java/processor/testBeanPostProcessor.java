package processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class testBeanPostProcessor implements BeanPostProcessor{

	// init-method 호출 전
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before");
		switch(beanName) {
			case "t1" :
				System.out.println("id가 t1인 bean 객체 생성");
				break;
			case "t2" :
				System.out.println("id가 t2인 bean 객체 생성");
				break;
		}
		return bean;
	}
	
	// init-method 호출 후
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After");
		return bean;
	}
}
