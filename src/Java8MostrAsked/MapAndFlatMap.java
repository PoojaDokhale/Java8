 package Java8MostrAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	public static void main(String[] args) {
		List<String> citi1=Arrays.asList("Pune","Mumbai");
		List<String> citi2=Arrays.asList("Pune","Mumbai","Nashik");
		Employee e1 = new Employee(10, "Pooja", 30,citi1);
		Employee e2 = new Employee(13, "Sunil", 35,citi2);
		Employee e3 = new Employee(18, "Advik", 25,citi1);
		
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		List<Integer> empIdList=empList.stream().map(i->i.getEmployeeId()).collect(Collectors.toList());
		empIdList.forEach(i->System.out.println(i));
		
		empList.stream().map(i->i.getCitiesWorkedOn()).forEach(i->System.out.println(i));
		
		empList.stream().flatMap(i->i.getCitiesWorkedOn().stream()).collect(Collectors.toSet()).forEach(i->System.out.println(i));
		
	}
}
