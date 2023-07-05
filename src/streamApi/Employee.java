package streamApi;

public class Employee {
	
	Integer employeeId;
	String employeeName;
	Integer age;
	
	
	public Employee(Integer employeeId, String employeeName, Integer age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
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
