package Algorithm.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/coin-change
 */
public class TEMP_TheCoinChangeProblem {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // value
		int M = in.nextInt(); // m coins
		int[] C = new int[M];
		for(int i = 0; i < M; i++) {
			C[i] = in.nextInt();
		}
		
		//sort
		Arrays.sort(C);
		
		// 确定最多次数跟最少次数
		// values包含几个最大值？
		int min = (N/C[M-1])+1;
		// values包含几个最小值？
		int max = (N/C[0])+1;

		
		for(int i = min; i <= max; i++) {
			int times = i;
			findChange(N, times, C);
		}
		
		
	}
	
	public static void findChange(int value, int times, int[] C) {
		if(times == 0 || value <= 0) {
			return ;
		}
		for (int i = 0; i < C.length; i++) {
			System.out.println("\nI="+i);
			if(C[i]==value) {
				System.out.print(C[i]+" "); 
			}
			else {
				findChange(value-C[i], times-1, C);
			}
			
		}
	}

}
