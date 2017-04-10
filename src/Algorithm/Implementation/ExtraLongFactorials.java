package Algorithm.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/extra-long-factorials?h_r=next-challenge&h_v=zen
 */

public class ExtraLongFactorials {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorials(n).toString());

	}

	public static BigInteger factorials(int num) {
		if (num == 1)
			return BigInteger.valueOf(1);
		else {
			return factorials(num - 1).multiply(BigInteger.valueOf(num));
		}
	}

}
