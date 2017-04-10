package Algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/the-hurdle-race
 */

public class TheHurdleRace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		// your code goes here
		
		Arrays.sort(height);
		System.out.println(height[n-1]>k?(height[n-1]-k):(0));
		
	}

}
