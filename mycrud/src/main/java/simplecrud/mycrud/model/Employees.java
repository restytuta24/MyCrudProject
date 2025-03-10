package simplecrud.mycrud.model;

public class Employees {
	
	private String name;
	private String department;
	private int age;
	
		
	public Employees(String name, String department, int age) {
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	public Employees() {
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	
	
	
	
	

}
