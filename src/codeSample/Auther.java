package codeSample;

public class Auther{
	String firstName;
	String surName;
	Integer age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Auther(String firstName, String surName, Integer age) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Auther [firstName=" + firstName + ", surName=" + surName + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Auther o) {
//		return this.age - o.age;
//	}
	

}
