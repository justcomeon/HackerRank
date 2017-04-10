package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-2d-arrays?h_r=next-challenge&h_v=zen
 */

public class Day11_2dArrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		// my code goes here
		int res = -9*6*6;
		for (int row_i = 0; row_i <= arr.length - 3; row_i++) {
			for (int col_i = 0; col_i <= arr[0].length - 3; col_i++) {
				int temp_res = 
				arr[row_i][col_i]+
				arr[row_i][col_i+1]+
				arr[row_i][col_i+2]+
				arr[row_i+1][col_i+1]+
				arr[row_i+2][col_i]+
				arr[row_i+2][col_i+1]+
				arr[row_i+2][col_i+2];
				if(temp_res>res)
					res = temp_res;						
			}
		}
		System.out.println(res);
	}

}
