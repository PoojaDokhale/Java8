package GSCode;

import java.util.Arrays;

public class CheckEqualArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 2, 3, 1 };
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr3, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
	}

}
