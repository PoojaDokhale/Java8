package snp_VIDHI;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 3, 1, 6, 8, 5, 2, 9 };
		for (int i = 1; i < a.length; i++) {
			int curr = a[i];
			int j = i - 1;
			while (j >= 0 && curr < a[j]) {
				a[j+1]=a[j];
				j--;

			}
			a[j+1]=curr;

		}
		printarray(a);
	}

	static void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
