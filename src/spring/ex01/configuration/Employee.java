package spring.ex01.configuration;

public class Employee {
	
	private Department dept;
	
	public Employee(){
		
	}
	
	public Employee(Department department){
		this.dept = department;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
	
}
