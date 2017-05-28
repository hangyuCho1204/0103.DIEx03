package spring.ex01.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//xml�� ������ �ڹٷ� ���ִ� ���� Configuration�̶�� �Ѵ�.
@Configuration
public class Config {
	@Bean
	public Department dept01(){//�޼ҵ� �̸��� ���̵�
		return new BusinessTeam();
	}
	//<Bean id="dept01" class="spring.ex01.configuration.BusinessTeam"/>
	@Bean
	public Department dept02(){//�޼ҵ� �̸��� ���̵�
		BusinessTeam bt = new BusinessTeam();
		bt.setName("�����");
		return bt;
	}
	//<Bean id="dept02" class="spring.ex01.configuration.BusinessTeam">
	//	<property name="name" value="�����"/>
	//</Bean>
	
	@Bean
	public Employee dept03(){//�޼ҵ� �̸��� ���̵�
		return new Employee();
	}
	//<Bean id="dept03" class="spring.ex01.configuration.Employee"/>
	
	@Bean
	public Employee dept04(){//�޼ҵ� �̸��� ���̵�
		return new Employee(dept02());
	}
	//<Bean id="dept03" class="spring.ex01.configuration.Employee"/>
	
}