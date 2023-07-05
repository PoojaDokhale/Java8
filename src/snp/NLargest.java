package snp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NLargest {
	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(2,4,6,7,8);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter order");
		int number=sc.nextInt();
		
		findNLrgestNumber(mylist,number);
		
	}

	private static void findNLrgestNumber(List<Integer> mylist,int number) {
		System.out.println(mylist.stream().sorted(Comparator.reverseOrder()).skip(number-1).findFirst().get());
		
	}

}
