package Sorting;

import java.util.ArrayList;
import java.util.List;

public class SortUsingLambda {
	public static void main(String args[]) {
		Employee e1 = new Employee(141, "Pooja", 5000);
		Employee e2 = new Employee(101, "Sunil", 10000);
		Employee e3 = new Employee(191, "Advik", 9000);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
//		empList.sort((Employee ob1,Employee ob2)-> ob1.getEmpName().compareTo(ob2.getEmpName()));
		empList.sort((Employee ob1,Employee ob2)-> ob1.getEmpNumber()-ob2.getEmpNumber());
		for (Employee employee : empList) {
			System.out.println(employee.toString());
		}
		
	
	}
}
