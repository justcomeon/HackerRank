package Algorithm.Implementation;

import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/utopian-tree?h_r=next-challenge&h_v=zen
 */

public class UtopianTree {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int nCase = in.nextInt();
        int height = 1, resHeight = 1;
        int[] N = new int[nCase];
        for(int n_i = 0; n_i < nCase; n_i++) {
            resHeight = 1;
            N[n_i] = in.nextInt();
            int cycle = N[n_i];
            int count = 0;
            while (cycle >0)
            {
            	if(count%2 == 0)
            	{
            		resHeight*=2;
            		count++;
            		cycle--;
            		continue;
            	}
            		
            	if(count%2 == 1) {
            		resHeight+=1;
            		count++;
            		cycle--;
            		continue;
            	}
            	
            }
            System.out.println(resHeight);
            
        }
    }

}
