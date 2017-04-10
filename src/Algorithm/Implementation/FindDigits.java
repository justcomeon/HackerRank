package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/find-digits?h_r=next-challenge&h_v=zen
 */

public class FindDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();	//the number of test cases
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();	

			// my code goes here
			int count = 0;
			char[] numArr = (""+n).toCharArray();
			for(int arr_i = 0; arr_i<numArr.length; arr_i++) {
				if(numArr[arr_i]=='0')
					continue;
				if(n%(numArr[arr_i]-48)==0) {
					count++;
				}
			}
			System.out.println(count);
			
			
		}
	}
}
