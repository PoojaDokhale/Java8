package snp_VIDHI;

import java.util.Arrays;
import java.util.Iterator;

public class RotateArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		// rotate 2 times
		int t = 2;
		//rotate(a, t);
		rotate1(a,t);
		printarray(a);
	}

	private static void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ") ;
		}
	}

	
	private static void rotate1(int[] a, int t) {
		int p=0;
		while(p<t) {
			int last=a[0];
			for (int i = 0; i < a.length-1; i++) {
				  a[i]=a[i+1];
			}
			a[a.length-1]=last;
			p++;
		}
		
	}

	private static void rotate(int[] a, int t) {
		for (int i = t; i < a.length; i++) {
			System.out.println(a[i]+" ") ;
		}
		for (int i = 0; i < t; i++) {
			System.out.println(a[i]+" ") ;
		}
		
	}

}
