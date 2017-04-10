package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-binary-numbers?h_r=next-challenge&h_v=zen
 */

public class Day10_BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int count = 0;
		String n_str = Integer.toBinaryString(n);
		char[] n_arr = n_str.toCharArray();
		for (int arr_i = 0; arr_i < n_arr.length; arr_i++) {
			int count_temp = 0;
			if (n_arr[arr_i] == '1') {
				int j = arr_i;
				while (n_arr[j] == '1') {
					count_temp++;
					j++;
					if (j >= n_arr.length)
						break;
				}
			}
			if (count_temp > count)
				count = count_temp;
		}
		System.out.println(count);
	}
}
