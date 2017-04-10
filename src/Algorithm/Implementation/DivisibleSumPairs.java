package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/divisible-sum-pairs
 */
public class DivisibleSumPairs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int res = 0;
		//循环加 然后mod k
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++) {
				if((a[i]+a[j])%k == 0)
					res++;
			}
		}
		System.out.println(res);
	}
}
