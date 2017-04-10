package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/permutation-equation
 */

public class SequenceEquation {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // the number of integers
		int[] p = new int[n]; // array

		for (int p_i = 0; p_i < n; p_i++) {
			p[p_i] = in.nextInt();
		}

		// 1<=x<=n
		for (int x = 1; x <= n; x++) {
			// find value =x
			// System.out.println("X="+x);
			for (int p1_i = 0; p1_i < n; p1_i++) {
				if (p[p1_i] == x) {
					int pSec = p1_i + 1;
					// find value = pSec
					for (int p2_i = 0; p2_i < n; p2_i++) {
						if (p[p2_i] == pSec) {
							System.out.println(p2_i + 1);
							// System.out.println("pSec="+pSec);
						}
					}
				}
			}
		}
	}
}
