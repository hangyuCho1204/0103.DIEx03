package spring.ex01.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//xml의 설정을 자바로 해주는 것을 Configuration이라고 한다.
@Configuration
public class Config {
	@Bean
	public Department dept01(){//메소드 이름이 아이디
		return new BusinessTeam();
	}
	//<Bean id="dept01" class="spring.ex01.configuration.BusinessTeam"/>
	@Bean
	public Department dept02(){//메소드 이름이 아이디
		BusinessTeam bt = new BusinessTeam();
		bt.setName("사업팀");
		return bt;
	}
	//<Bean id="dept02" class="spring.ex01.configuration.BusinessTeam">
	//	<property name="name" value="사업팀"/>
	//</Bean>
	
	@Bean
	public Employee dept03(){//메소드 이름이 아이디
		return new Employee();
	}
	//<Bean id="dept03" class="spring.ex01.configuration.Employee"/>
	
	@Bean
	public Employee dept04(){//메소드 이름이 아이디
		return new Employee(dept02());
	}
	//<Bean id="dept03" class="spring.ex01.configuration.Employee"/>
	
}