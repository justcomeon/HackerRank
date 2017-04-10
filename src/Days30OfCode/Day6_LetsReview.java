package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-review-loop?h_r=next-challenge&h_v=zen
 */

public class Day6_LetsReview {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();	//the number of cases

		for(int t_i = 0; t_i < t; t_i++) {
			String caseStr = in.next();
			//System.out.println(caseStr+" "+caseStr.length());
			char[] charArr = caseStr.toCharArray();
			for(int arr_i = 0; arr_i < charArr.length; arr_i++) {
				if(arr_i%2==0) {
					System.out.print(charArr[arr_i]);
				}
			}
			System.out.print(" ");
			for(int arr_i = 0; arr_i < charArr.length; arr_i++) {
				if(arr_i%2==1) {
					System.out.print(charArr[arr_i]);
				}
			}
			System.out.println("");
		}		
	}

}
