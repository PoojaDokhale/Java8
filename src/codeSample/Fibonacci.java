package codeSample;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n1=0,n2=1,n3,count;
		System.out.println("Enter number");
		Scanner sc =new Scanner(System.in);
	
		count=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		while(count>0) {
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			
			n2=n3;
			
			count--;
		}
	}

}
