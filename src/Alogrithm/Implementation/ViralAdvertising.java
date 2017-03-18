package Alogrithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/strange-advertising
 */

public class ViralAdvertising {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = 0;
		int initP = 5;
		for(int i=0; i < n; i++) {
			int interestP = 0;
			interestP+=initP/2;
			res+=interestP;
			initP = interestP * 3;
		}
		System.out.println(res);
		
	}

}
