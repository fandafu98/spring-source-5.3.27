package example.type;

import org.springframework.core.testfixture.stereotype.Component;

@Component
public class HelloBean {
	public void hello(){
		System.out.println("hello spring");
	}
}
