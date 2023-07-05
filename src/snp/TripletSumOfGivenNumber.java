package snp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TripletSumOfGivenNumber {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(2, 4, 6, 8);
		System.out.println(myList.stream().map(i -> i * i * i).reduce((a, b) -> a + b).get());
		Integer[] myArray = { 12, 3, 4, 1, 6, 9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sumvalue");
		int number = sc.nextInt();
		//findTripletSum(myArray, number);
		findTripletSum(myArray,myArray.length,number);

	}

	//Time complexity o(n*2)
	private static void findTripletSum(Integer[] myArray, int length, int number) {
		
		for (int i = 0; i < myArray.length-2; i++) {
			
			Integer current_sum = number-myArray[i];
			Set<Integer> set=new HashSet<Integer>();
			
			for (int j = i+1; j < myArray.length; j++) {
				if(set.contains(current_sum-myArray[j])) {
					System.out.println(current_sum-myArray[j]+", "+myArray[j]+", "+myArray[i]);
				}
				set.add(myArray[j]);
			}
			
		}
	}

	//Time complexity o(n*3)
	private static void findTripletSum(Integer[] myArray, int number) {
		for (int i = 0; i < myArray.length - 2; i++) {
			for (int j = i + 1; j < myArray.length - 1; j++) {
				for (int k = j+1; k < myArray.length; k++) {
					if (myArray[i] + myArray[j] + myArray[k] == number) {
						System.out.println(myArray[i] + " "+ myArray[j] + " "+ myArray[k]);
					}
				}

			}
              
		}
	}
}
