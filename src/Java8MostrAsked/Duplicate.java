package Java8MostrAsked;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 58, 3, 56, 45, 45, 6, 10, 23, 5, 6, 78, 23);
		Set set=new HashSet<>();
		//Duplicates
		list.stream().filter(i->!set.add(i)).collect(Collectors.toSet()).forEach(i->System.out.println(i));
		
		//Unique
		list.stream().collect(Collectors.toSet()).forEach(i->System.out.println("-------"+i));
	}
}
