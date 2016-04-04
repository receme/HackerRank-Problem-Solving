import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		new Staircase().solve();
	}

	public static class MyUtils {

		public static void printf(int val) {
			System.out.println(val);
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

}