package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Pooja", 30);
		Employee e2 = new Employee(13, "Sunil", 35);
		Employee e3 = new Employee(18, "Advik", 25);
		
		List<Employee> empList= new ArrayList();
		empList.stream().map(i->i.getEmployeeId()).collect(Collectors.toList());
	}
}
