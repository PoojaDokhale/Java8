package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "pooja@gmail.com", 20);
		Employee emp2 = new Employee(1, "abc@yahoo.com", 20);
		Employee emp3 = new Employee(1, "pqr@gmail.com", 20);
		Employee emp4 = new Employee(1, "sdf@yahoo.com", 20);
		Employee emp5 = new Employee(1, "qeqwee@rediffmail.com", 20);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		empList.stream().map(i->i.getEmployeeName().
				substring(i.getEmployeeName().indexOf("@"),i.getEmployeeName().length()-1))
		.collect(Collectors.groupingBy(i->i,Collectors.counting())).forEach((i,j)->System.out.println(i+" "+j));;
		

		String s = "The quick brown fox jumps right over the little lazy dog.";
		Arrays.stream(s.split(" ")).filter(i -> i.replaceAll("[^aouieAOUIE]", "").length() == 2)
				.collect(Collectors.toList()).forEach(i -> System.out.println(i + " "));
	}

}
