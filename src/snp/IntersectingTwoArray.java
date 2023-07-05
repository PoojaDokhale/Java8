package snp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectingTwoArray {

	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 4, 5, 8, 6 };
		Integer[] array2 = { 2, 3, 7, 8, 9 };
		
		// Intersection of Two Lists of Strings

		List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");

		List<String> otherList = Arrays.asList("red", "green", "green", "yellow");

		List<Set<String>> resultList=new ArrayList<>();
		
		resultList.add(list.stream().collect(Collectors.toSet()));
		resultList.add(otherList.stream().collect(Collectors.toSet()));
		Set set=new HashSet<>();
		resultList.stream().flatMap(i->i.stream())
		.filter(x->!set.add(x))
		.forEach(x->System.out.println(x));;		
		/*
		 * List<Integer> resultList=Stream.concat(Arrays.stream(array1),
		 * Arrays.stream(array2)).toList(); System.out.println("Union of array: ");
		 * resultList.stream().distinct().forEach(i->System.out.print(i+" "));
		 * System.out.println("\nIntersection of array: "); Set<Integer> set=new
		 * HashSet<>();
		 * resultList.stream().filter(i->!set.add(i)).forEach(i->System.out.print(i+" ")
		 * );
		 * 
		 */
		
		List<List<Integer>> mylist=new ArrayList<>();
		mylist.add(Arrays.asList(array1));
		mylist.add(Arrays.asList(array2));
		
//		Set<Integer> set1=new HashSet<>();
//		mylist.stream().flatMap(i->i.stream()).collect(Collectors.toList()).stream().filter(i->!set1.add(i)).forEach(i->System.out.println(i));
//			
	}

}
