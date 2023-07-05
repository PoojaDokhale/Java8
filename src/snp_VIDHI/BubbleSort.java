package snp_VIDHI;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 3, 1, 6, 8, 5, 2, 9 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}

		}

		printarray(a);
	}

	static void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
