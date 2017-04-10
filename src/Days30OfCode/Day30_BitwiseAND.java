package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-bitwise-and
 */

public class Day30_BitwiseAND {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			//System.out.println(findTheValue(n, k));
			int res = 0;
			for(int i=0; i<=n; i++) {
				for(int j=0; j<=n; j++) {
					if(i == j){
						continue;
					}
					if((i&j)>res && (i&j)<k){
						res = i&j;
					}
				}
			}
			System.out.println(res);
		}
	}
/*
	public static int findTheValue(int n, int k) {
		// needs a valve > res && <k
		int res = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == j) {
					continue;
				}
				String bit_i = Integer.toBinaryString(i);
				String bit_j = Integer.toBinaryString(j);
				// System.out.println("BEFORE "+bit_i+" "+bit_j);
				if (bit_i.length() > bit_j.length()) {
					// extends bit_j
					char[] temp = new char[bit_i.length()];
					int diff = bit_i.length() - bit_j.length();
					for (int temp_i = 0; temp_i < diff; temp_i++) {
						temp[temp_i] = '0';
					}
					char[] arr_j = bit_j.toCharArray();
					for (int temp_i = diff; temp_i < bit_i.length(); temp_i++) {
						temp[temp_i] = arr_j[temp_i - diff];
					}
					int temp_res = bitwiseAnd(bit_i, String.valueOf(temp));
					if (temp_res > res && temp_res < k) {
						res = temp_res;
					}
				} else if (bit_i.length() < bit_j.length()) {
					// extends bit_i
					char[] temp = new char[bit_j.length()];
					int diff = bit_j.length() - bit_i.length();
					// System.out.println("diff=" + diff);
					for (int temp_j = 0; temp_j < diff; temp_j++) {
						temp[temp_j] = '0';
					}
					char[] arr_i = bit_i.toCharArray();
					for (int temp_j = diff; temp_j < bit_j.length(); temp_j++) {

						temp[temp_j] = arr_i[temp_j - diff];
					}
					int temp_res = bitwiseAnd(String.valueOf(temp), bit_j);
					if (temp_res > res && temp_res < k) {
						res = temp_res;
					}
				} else {

					int temp_res = bitwiseAnd(bit_i, bit_j);
					if (temp_res > res && temp_res < k) {
						res = temp_res;
					}
				}
			}
		}
		return res;
	}

	public static int bitwiseAnd(String a, String b) {
		char[] arr_a = a.toCharArray();
		char[] arr_b = b.toCharArray();
		char[] arr_res = new char[arr_a.length];
		for (int i = 0; i < arr_a.length; i++) {
			if (arr_a[i] == '0' || arr_b[i] == '0') {
				arr_res[i] = '0';
			} else {
				arr_res[i] = '1';
			}
		}
		String res = String.valueOf(arr_res);
		return Integer.valueOf(res, 2);
	}
*/
}
