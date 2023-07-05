package snp;

import java.util.Iterator;
import java.util.Scanner;

public class DesignSpiralMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		int dir = 0;
		int rowVal = 1;
		while (top <= bottom && left <= right) {
			if (dir == 0) {
				for (int i = left; i <= right; i++) {
					matrix[top][i] = rowVal++;
				}
				top++;
			} else if (dir == 1) {
				for (int i = top; i <= bottom; i++) {
					matrix[i][right] = rowVal++;
				}
				right--;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--) {
					matrix[bottom][i] = rowVal++;
				}
				bottom--;
			} else if (dir == 3) {
				for (int i = bottom; i >= top; i--) {
					matrix[i][left] = rowVal++;
				}
				left++;
			}
			dir = (dir + 1) % 4;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(matrix[i][j] + " ");
			}
		}
	}
}
