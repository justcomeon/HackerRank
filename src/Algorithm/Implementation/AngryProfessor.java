package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/angry-professor
 */

public class AngryProfessor {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();

		for (int case_i = 0; case_i < test_case; case_i++) {
			int n, k;
			n = in.nextInt();
			k = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}

			int count = 0;
			for (int stu : a) {
				if (stu <= 0)
					count++;
			}
			System.out.println((count >= k) ? "NO" : "YES");

		}
	}

}
