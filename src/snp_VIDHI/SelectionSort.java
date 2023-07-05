package snp_VIDHI;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 3, 1, 6, 8, 5, 2, 9 };

		for (int i = 0; i < a.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}

			}
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;

		}
		printarray(a);
	}

	static void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
