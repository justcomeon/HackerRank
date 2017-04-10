package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-loops?h_r=next-challenge&h_v=zen
 */
public class Day5_Loops {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int multiples = 1;
        while(multiples<=10){
        	System.out.println(n+" x "+multiples+" = "+multiples*n);
        	multiples++;
        }
    }
}
