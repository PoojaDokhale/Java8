package snp_VIDHI;

public class SortArray {

	public static void main(String[] args) {
		int[] a = { 2, 5, 8, 1, 0, -23, 4, -12 };
		sort(a);
		printarray(a);
	}

	private static void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i + 1]) {
				a[i] = a[i] + a[i + 1];
				a[i + 1] = a[i] - a[i + 1];
				a[i] = a[i] - a[i + 1];
				i = -1;
			}
		}

	}

}
