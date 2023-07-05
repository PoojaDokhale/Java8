package Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparatorbeforeJava8 {
	
	public static void main(String args[]) {
		Employee e1=new Employee(141, "Pooja", 5000);
		Employee e2=new Employee(101, "Sunil", 10000);
		Employee e3=new Employee(191, "Advik", 9000);
		
		List<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Comparator compareByName=new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
					return e1.empName.compareTo(e2.empName);
			}
			
		};
		
		Comparator compareById=new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.empNumber.compareTo(e2.empNumber);
			}
			
		};
		
		empList.sort(compareById);
		empList.sort(compareByName);
		for (Employee employee : empList) {
			System.out.println(employee.toString());
		}
	}
	
}
