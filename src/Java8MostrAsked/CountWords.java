package Java8MostrAsked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountWords {
	public static void main(String[] args) {
		String str="welcome to code decode and code decode welcome you";
		List<String> strList=Arrays.asList(str.split(" "));
		
		
		Function<String, String> fun=Function.identity();
		System.out.println(fun.apply("Hi"));
		
		strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.forEach((i,j) -> System.out.println(i+ ": "+j+"\n"));;
	}
}
