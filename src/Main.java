import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		new MatrixRotation().solve();
	}

	public static class MyUtils {

		public static void printInt(int val) {
			System.out.println(val);
		}

		public static void printString(String val) {
			System.out.println(val);
		}

	}

	public static class MatrixRotation {

		public void solve() {
			Scanner sc = new Scanner(System.in);

			int m = sc.nextInt();
			int n = sc.nextInt();
			int rotation = sc.nextInt();

			int[][] arr = new int[m][n];

			for (int i = 0; i < m; i++)
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}

			int cycle = Math.min(m, n) / 2;

			for (int i = 0; i < cycle; i++) {
				int m1 = m - (2 * i) + i;
				int n1 = n - (2 * i) + i;

				int currentMaxRotation = rotation % ((2 * m1) + 2 * (n1 - 2));

				for (int l = 0; l < 1; l++) {

					int temp1 = arr[i][i];
					int temp2 = arr[m1 - 1][n1 - 1];

					for (int j = i; j < m1 - 2 - i; j++) {
						// System.out.println(i+" "+(j+1));
						arr[i][j] = arr[i][j + 1];
					}

					for (int k = m1 - i; k >= i + 1; k--) {
						System.out.println((n1 - 1) + " " + (k - 1));
						arr[n1 - 1][k] = arr[n1 - 1][k - 1];
					}
					//
					//
					//
					// for (int j = n1 - 1 - i; j >= i + 2; j--) {
					//
					// arr[j][i] = arr[j - 1][i];
					//
					// }
					//
					// for (int k = i; k <= n1 - 2; k++) {
					// arr[k][m1 - 1] = arr[k + 1][m1 - 1];
					// }
					//
					// arr[i + 1][i] = temp1;
					// arr[n1 - 2][m1 - 1] = temp2;

				}

			}

			// rotation = (2 * m + 2 * (n - 2)) % rotation;

			for (int ii = 0; ii < m; ii++) {
				for (int jj = 0; jj < n; jj++) {

					System.out.print(arr[ii][jj] + " ");
				}
				System.out.println();
			}

		}
	}

}