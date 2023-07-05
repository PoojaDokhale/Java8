package Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee1 implements Externalizable{
	private static final long serialVersionUID = 1L;
	Integer empId;
	String empName;
	public Employee1(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	out.write(empId);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		in.readInt();
		
	}

}
