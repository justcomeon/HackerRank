package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies?h_r=next-challenge&h_v=zen
 */

public class BeautifulDaysatTheMovies {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		
		Scanner in = new Scanner(System.in);
		int i,j,k,result=0;
		i = in.nextInt(); // start
		j = in.nextInt(); // end
		k = in.nextInt();
		
		for(int day_i = i; day_i<=j; day_i++) {
			if(Math.abs(day_i-reversed(day_i))%k == 0) {
				result++;
			}
		}
		System.out.println(result);
		
		
	}
	//reverse a num
	public static int reversed(int n) {
		String num = String.valueOf(n);
		char[] num_arr = num.toCharArray();
		char[] num_rev = new char[num_arr.length];
		for(int arr_i = 0; arr_i<num_arr.length; arr_i++) {
			num_rev[num_rev.length-arr_i-1] = num_arr[arr_i];
		}
		return Integer.valueOf(String.valueOf(num_rev));
	}
}
