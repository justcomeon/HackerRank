package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-bitwise-and
 */
public class Day29_BitwiseAND {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int res = 0;
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					if (i == j) {
						continue;
					}
					if ((i & j) > res && (i & j) < k) {
						res = i & j;
					}
				}
			}
			System.out.println(res);
		}
	}

}
