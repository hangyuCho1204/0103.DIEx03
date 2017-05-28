package spring.ex01.configuration;

public class BusinessTeam implements Department{
	private String name;
	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("¿µ¾÷");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
