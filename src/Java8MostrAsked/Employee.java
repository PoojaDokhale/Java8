package Java8MostrAsked;

import java.util.List;

public class Employee {
	
	Integer employeeId;
	String employeeName;
	Integer age;
	List<String> CitiesWorkedOn;
	

	public Employee(Integer employeeId, String employeeName, Integer age, List<String> citiesWorkedOn) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		CitiesWorkedOn = citiesWorkedOn;
	}

	public List<String> getCitiesWorkedOn() {
		return CitiesWorkedOn;
	}

	public void setCitiesWorkedOn(List<String> citiesWorkedOn) {
		CitiesWorkedOn = citiesWorkedOn;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", age=" + age + "]";
	}
	
	
	

}
