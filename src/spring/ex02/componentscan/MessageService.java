package spring.ex02.componentscan;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

		public String getMessage(){
			return "Hello Spring!!!";
		}
}
