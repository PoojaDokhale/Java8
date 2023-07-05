package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Pooja", 30);
		Employee e2 = new Employee(13, "Sunil", 35);
		Employee e3 = new Employee(18, "Advik", 25);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		List<Employee> newEmpList = empList.stream()
				.sorted((emp1, emp2) -> emp1.getEmployeeName().compareTo(emp2.getEmployeeName()))
				.collect(Collectors.toList());

		List<Employee> newEmpList1 = empList.stream().sorted((emp1, emp2) -> emp2.getAge().compareTo(emp1.getAge()))
				.collect(Collectors.toList());
		
		for (Employee employee : newEmpList) {
			System.out.println(employee.toString());
		}

		for (Employee employee : newEmpList1) {
			System.out.println(employee.toString());
			
			
		}

	}

}
