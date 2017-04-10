package Days30OfCode;

import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/30-recursion?h_r=next-challenge&h_v=zen
 */

public class Day9_Recursion {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
	}
	
	public static int factorial(int num) {
		if(num == 1)
			return 1;
		return factorial(num-1) * num;
	}

}
