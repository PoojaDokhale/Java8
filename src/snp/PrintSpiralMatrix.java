package snp;

import java.util.Scanner;

public class PrintSpiralMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		int rowVal = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = rowVal++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
//				System.out.print(matrix[i][j] + " ");
			}
		}

		printSprialMatrix(matrix, n);

	}

	public static void printSprialMatrix(int[][] matrix, int n) {
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		int dir = 0;
		/*
		 * while (left <= right && top <= bottom) { switch (dir) { case 0: { for (int i
		 * = left; i <= right; i++) System.out.println(matrix[top][i]); top++; } case 1:
		 * { for (int i = top; i <= bottom; i++) System.out.println(matrix[i][right]);
		 * right--; } case 2: { for (int i = right; i >= left; i--)
		 * System.out.println(matrix[bottom][i]); bottom--; } case 3: { for (int i =
		 * bottom; i >= top; i--) System.out.println(matrix[i][left]); left++; }
		 * 
		 * }
		 * 
		 * dir=(dir+1)%4; }
		 */

		while (top <= bottom && left <= right) {
			if (dir == 0) {
				for (int i = left; i <= right; i++) {
					System.out.println(matrix[top][i]);

				}
				top++;
			} else if (dir == 1) {
				for (int i = top; i <= bottom; i++) {
					System.out.println(matrix[i][right]);

				}
				right--;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--) {
					System.out.println(matrix[bottom][i]);

				}
				bottom--;
			} else if (dir == 3) {
				for (int i = bottom; i >= top; i--) {
					System.out.println(matrix[i][left]);
				}
				left++;
			}

			dir = (dir + 1) % 4;
		}

	}

}
