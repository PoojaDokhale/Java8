package snp;

import java.util.List;

public class Student {
	Integer studentId;
    List<Integer> marksList;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", marksList=" + marksList + "]";
	}
	public Student(Integer studentId, List<Integer> marksList) {
		super();
		this.studentId = studentId;
		this.marksList = marksList;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public List<Integer> getMarksList() {
		return marksList;
	}
	public void setMarksList(List<Integer> marksList) {
		this.marksList = marksList;
	} 
}
