package Alorithm.Stings;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/hackerrank-in-a-string
 */

public class HackerRankinaString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		String hr = "hackerrank";
		char[] hrArr = hr.toCharArray();
		String[] resStr = new String[q];

		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			// your code goes here
			int p = 0; // pointer for hackerrank
			char[] charArr = s.toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				if (p == 10) {
					break;
				}
				// 这里有个问题 就是p可能会越界
				if (charArr[i] == hrArr[p]) {
					p++;
					// System.out.println(p+" "+charArr[i]);
				}
			}
			if (p == 10) {
				resStr[a0] = "YES";
			} else {
				// System.out.println(p);
				resStr[a0] = "NO";
			}
		}

		for (int i = 0; i < resStr.length; i++) {
			System.out.println(resStr[i]);
		}

		in.close();
	}
}
/*
 * 2 hereiamstackerrank hackerworld
 */
