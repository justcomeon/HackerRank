package Days30OfCode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity?h_r=next-challenge&h_v=zen
 */

public class Day25_RunningTimeAndComplexity {
	public static void main(String[] args) {
        /* Enter your code here. */
		Scanner in  = new Scanner(System.in);
		int t = in.nextInt(); //the number of test cases
		int[] nums = new int[t];
		for(int t_i = 0; t_i<nums.length; t_i++) {
			nums[t_i] = in.nextInt();
			
			
			//check
			if(isPrime(nums[t_i]))
				System.out.println("Prime");
			else {
				System.out.println("Not prime");
			}
		}
		
    }
	public static boolean isPrime(int n) {
		boolean res = true;
		if(n <2 || (n%2==0 && n!=2))
			return false;
		for(int i=3; i<n; i+=2) {
			if(n%i==0)
				return false;
		}
		return res;
	}

}
