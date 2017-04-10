package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/bon-appetit?h_r=next-challenge&h_v=zen
 */
public class BonAppetit {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		int n, k, d;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		int[] cost = new int[n];
		for (int i = 0; i < n; i++) {
			cost[i] = scanner.nextInt();
		}
		d = scanner.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(i==k)
				continue;
			sum += cost[i];
		}
		
		if( sum /2 == d) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(d-(sum/2));
		}

	}

}
