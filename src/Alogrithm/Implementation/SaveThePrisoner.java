package Alogrithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/save-the-prisoner?h_r=next-challenge&h_v=zen
 */

public class SaveThePrisoner {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);

		int t = in.nextInt(); // the num of test case
		int n = in.nextInt(); // the num of prisoners 5
		int m = in.nextInt(); // the num of sweets 2 
		int s = in.nextInt(); // the start prisoner ID 1
		int result = 0;

		for (int t_i = 0; t_i < t; t_i++) {

			int rest = n - s + 1; // get the rest of 1st round 5
			while (m > rest) {
				m -= n;
			}

			result = s + m - 1;
			System.out.println(result);
		}
	}

}
