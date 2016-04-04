import java.util.Scanner;

public class Solutions {

	public static class PlusMinus {

		public void solve(Scanner sc) {
			int n = sc.nextInt();
			int a[] = new int[n];

			int c1 = 0, c2 = 0, c3 = 0;
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();

				if (val > 0) {
					c1++;
				} else if (val < 0) {
					c2++;
				} else {
					c3++;
				}

			}

			System.out.printf("%.6f\n", c1 / (double) n);
			System.out.printf("%.6f\n", c2 / (double) n);
			System.out.printf("%.6f\n", c3 / (double) n);
		}
	}

	public static class DiagonalDifference {

		public void calculate() {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					int val = scanner.nextInt();
					arr[i][j] = val;
				}
			int sum1 = 0;
			for (int i = 0; i < n; i++) {

				sum1 += arr[i][i];

			}

			int sum2 = 0;
			int j = 0;
			for (int i = n - 1; i >= 0; i--) {
				sum2 += arr[i][j];
				j++;
			}

			System.out.println(Math.abs(sum1 - sum2));
		}

	}
}
