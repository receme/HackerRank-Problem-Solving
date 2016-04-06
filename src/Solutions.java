import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solutions {

	public static class ExtraLongFactorials {

		public void solve() {

			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();

			BigInteger ans = new BigInteger("1");

			for (int i = 2; i <= N; i++) {

				ans = ans.multiply(new BigInteger(i + ""));
			}

			System.out.println(ans.toString());

		}
	}

	public static class ChocolateFeast {

		public void solve() {

			Scanner sc = new Scanner(System.in);
			int cas = sc.nextInt();

			for (int t = 0; t < cas; t++) {
				int m = sc.nextInt();
				int n = sc.nextInt();
				int p = sc.nextInt();

				int total = m / n;
				int r = total;

				while (true) {

					if (r < p)
						break;

					total += r / p;
					r = r / p + r % p;

				}

				System.out.println(total);
			}
		}

	}

	public static class CutTheSticks {

		public void solve() {
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			List<Integer> arr = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}

			while (true) {
				if (arr.size() != 0)
					System.out.println(arr.size());

				if (arr.size() <= 1)
					break;

				Collections.sort(arr);
				int min = arr.get(0);

				for (int i = arr.size() - 1; i >= 0; i--) {

					int val = arr.get(i) - min;

					if (val == 0) {
						arr.remove(i);
					} else {
						arr.remove(i);
						arr.add(i, val);
					}

				}

			}

		}
	}

	public static class ServiceLane {

		public void solve() {
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int t = sc.nextInt();

			List<Integer> arr = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}

			for (int l = 0; l < t; l++) {

				int p = sc.nextInt();
				int q = sc.nextInt();

				int ans = Collections.min(arr.subList(p, q + 1));

				System.out.println(ans);
			}
		}

	}

	public static class SherlockAndSquares {

		List<Long> map = new ArrayList<>();
		Map<Long, Boolean> tt = new HashMap<Long, Boolean>();

		public void solve() {
			map.add(1L);

			int n = (int) Math.sqrt(1000000000);

			for (int i = 2; i <= n; i++) {
				long val = (long) Math.pow(i, 2);
				map.add(val);
			}

			Scanner sc = new Scanner(System.in);

			int cas = sc.nextInt();

			for (int t = 0; t < cas; t++) {

				long p = sc.nextLong();
				long q = sc.nextLong();

				int count = 0;

				for (int i = 0; i < map.size(); i++) {
					long val = map.get(i);

					if (val >= p && val <= q) {
						count++;
					}

					if (val > q)
						break;
				}

				System.out.println(count);

			}
		}
	}

	public static class FindDigits {

		public void solve() {
			Scanner sc = new Scanner(System.in);

			int cas = sc.nextInt();

			for (int t = 0; t < cas; t++) {
				long n = sc.nextLong();

				String s = Long.toString(n);

				int count = 0;
				for (int i = 0; i < s.length(); i++) {
					int val = Integer.parseInt(s.charAt(i) + "");

					if (val == 0)
						continue;

					if (n % val == 0)
						count++;
				}

				System.out.println(count);
			}
		}
	}

	public static class SherlockAndTheBeast {

		public void solve() {
			Scanner sc = new Scanner(System.in);

			int cas = sc.nextInt();

			for (int i = 0; i < cas; i++) {

				int n = sc.nextInt();

				if (n < 3) {
					System.out.println("-1");
				} else {

					int countOfFive, countOfThree;

					if (n % 3 == 0) {
						countOfFive = n;
						countOfThree = 0;
					} else if (n != 5 && n < 8) {
						System.out.println("-1");
						continue;
					} else {
						countOfThree = n % 3;

						countOfFive = n - countOfThree;

						while (!(countOfFive % 3 == 0 && countOfThree % 5 == 0)) {
							countOfFive -= 3;
							countOfThree += 3;
						}

					}

					for (int j = 0; j < countOfFive; j++) {
						System.out.print("5");
					}
					for (int j = 0; j < countOfThree; j++) {
						System.out.print("3");
					}

					System.out.println("");

				}

			}

		}
	}

	public static class AngryProfessor {

		public void solve() {
			Scanner sc = new Scanner(System.in);

			int cas = sc.nextInt();

			for (int t = 0; t < cas; t++) {

				int n = sc.nextInt();
				int k = sc.nextInt();

				int c = 0;
				for (int i = 0; i < n; i++) {
					int val = sc.nextInt();
					if (val <= 0)
						c++;
				}

				if (c >= k) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}

			}
		}
	}

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
