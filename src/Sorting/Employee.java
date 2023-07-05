package Sorting;

public class Employee {
	Integer empNumber;
	String empName;
	Integer salary;
	
	public Employee(Integer empNumber, String empName, Integer salary) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	public Integer getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
}
