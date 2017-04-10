package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-arrays?h_r=next-challenge&h_v=zen
 */

public class Day7_Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		
		for(int arr_i = 0; arr_i < n; arr_i++){
			System.out.print(arr[n-arr_i-1]+" ");
		}
		
	}

}
