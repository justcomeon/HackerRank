package Algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/picking-numbers
 */

public class PickingNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		
		//my code here
		int res = 0;
		int max = 0, tempMax = 0;
		Arrays.sort(a);
		
		for(int i: a){
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		for(int a_i = a.length-1; a_i >0; a_i--) {
			tempMax = 0;
			for(int a_j = a_i ; a_j>=0; a_j--){
				if(a_i == a_j)
					continue;
				if(Math.abs(a[a_i] - a[a_j])<=1){
					System.out.println(a[a_i]+"-"+a[a_j]);
					tempMax++;
				}
			}
			if(tempMax>=max)
				max = tempMax;
			System.out.println("-");
		}
		System.out.println(max+1);
	}

}
