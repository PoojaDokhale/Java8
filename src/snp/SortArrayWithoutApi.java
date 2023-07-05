package snp;

public class SortArrayWithoutApi {
	public static void main(String[] args) {
		int a[] = { 2, 5, 11, 31, -12, 78, 0, -10 };
		a = swap(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

	private static int[] swap(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1]) {
				//swap
				/*
				 * a[i]=a[i]+a[i+1]; a[i+1] = a[i]-a[i+1]; a[i]=a[i]-a[i+1];
				 */
				int temp=a[i];
				a[i] = a[i+1];
				a[i+1]=temp;
				
				i=-1;
			}
			
		}
		return a;
	}
}
