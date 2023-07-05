package snp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenOddFromList {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);
//		System.out.println(myList.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum());
//		System.out.println(myList.stream().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).sum());
		
		
		myList.stream().collect(Collectors.partitioningBy(i->i%2==0,Collectors.summarizingInt(Integer::intValue)))
		.forEach((i,j)->{
			if(i) {
				System.out.println("sum of even : "+j.getSum());
			}else {
				System.out.println("sum of odd : "+j.getSum());
			}
		});
		myList.stream().collect(Collectors.groupingBy(i->i%2==0 ? "Even" : "Odd"))
		.forEach((i,j)->System.out.println(i+": "+j));	

		String s = "I am interested123455 to grow in my organization"; 
		List<String> str=Arrays.asList(s.split(" "));
		System.out.println(str.stream().max(Comparator.comparing(String::length)).get());
		System.out.println(str.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get().length());
		
		List<Integer> asList = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 37);
		asList.stream().collect(Collectors.groupingBy(i->i/10))
		.forEach((i,j)->System.out.println(i+": "+j));;
		
		List listOfStrings=Arrays.asList("as", "123", "32", "2as");
		//listOfStrings.stream().filter(x->x.matches("[0-9]*")).map(Integer::valueOf).collect(Collectors.toList());
	}
}
