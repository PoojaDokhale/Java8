package GSCode;

public class PyramidPattern {
	public static void main(String[] args) {

		Integer numberOfRow = 8;
		Integer rowCount = 1;
		for (int i = numberOfRow; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();
			rowCount++;

		}
	}
}
