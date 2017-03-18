package Alogrithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */

public class BreakingTheReords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		// your code goes here
		int maxBreak = 0, minBreak = 0, highRecord = 0, lowRecord = 0;
		for (int score_i = 0; score_i < score.length; score_i++) {
			if (score_i == 0) {
				highRecord = score[score_i];
				lowRecord = score[score_i];
			}
			
			if (score[score_i] > highRecord) {
				highRecord = score[score_i];
				maxBreak++;
			}
			if (score[score_i] < lowRecord) {
				lowRecord = score[score_i];
				minBreak++;
			}
		}
		System.out.println((maxBreak) + " " + (minBreak));

	}

}
