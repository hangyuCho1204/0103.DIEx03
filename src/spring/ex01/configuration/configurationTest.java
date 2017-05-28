package spring.ex01.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configurationTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ex01/configuration/Bean-configuration.xml");
		
		BusinessTeam dept1 = (BusinessTeam)ctx.getBean("dept01");
		BusinessTeam dept2 = (BusinessTeam)ctx.getBean("dept02");
		
		dept1.work();
		dept2.work();
		
		Employee emp1 = (Employee)ctx.getBean("dept03");
		Employee emp2 = (Employee)ctx.getBean("dept04");
		
		//emp1.getDept().work();
		emp2.getDept().work();
		
	}
}
