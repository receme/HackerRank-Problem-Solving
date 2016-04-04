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

	public static class Staircase {

		public void solve() {
			Scanner s = new Scanner(System.in);

			int n = s.nextInt();

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n - i - 1; j++) {
					System.out.print(" ");
				}

				for (int k = 0; k < i + 1; k++)
					System.out.print("#");

				System.out.print("\n");
			}
		}
	}

	public static class TimeConversion {

		public void solve() {

			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();

			String hour = input.substring(0, 2);
			String time = input.substring(input.length() - 2, input.length());

			StringBuilder sb = new StringBuilder();
			if (time.equals("PM")) {
				int hourVal = Integer.parseInt(hour);
				String hourStr;

				if (hourVal < 12) {
					hourVal += 12;

				}

				hourStr = Integer.toString(hourVal);

				sb.append(hourStr + input.substring(2, input.length() - 2));
			} else {
				int hourVal = Integer.parseInt(hour);

				String hourStr = Integer.toString(hourVal);

				if (hourVal == 12) {
					hourVal = 0;
					hourStr = "0";
				}

				if (hourVal < 10) {
					hourStr = "0" + hourVal;
				}

				sb.append(hourStr + input.substring(2, input.length() - 2));
			}

			System.out.println(sb.toString());

		}
	}
}
