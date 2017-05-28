package spring.ex02.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		MessagePrinter mp = (MessagePrinter)ctx.getBean("messagePrinter");
		
		mp.printMessage();
	}
}
