package Algorithm.Warmup;
import java.util.Scanner;

public class Staircase {
	/*
	 * Consider a staircase of size :
	 * 
	 *    # 
	 *   ## 
	 *  ### 
	 * #### 
	 * Observe that its base and height are both equal to , and
	 * the image is drawn using # symbols and spaces. The last line is not
	 * preceded by any spaces.
	 * 
	 * Write a program that prints a staircase of size .
	 * 
	 * Input Format
	 * 
	 * A single integer, , denoting the size of the staircase.
	 * 
	 * Output Format
	 * 
	 * Print a staircase of size using # symbols and spaces.
	 * 
	 * Note: The last line must have spaces in it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	      int n = in.nextInt();
	      
	      for(int i=0; i<n; i++)
	      {
	    	  //´òÓ¡¿Õ¸ñ
	    	  for(int j=0; j<n-i-1;j++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  //´òÓ¡#
	    	  for(int k=0; k<i+1;k++)
	    	  {
	    		  System.out.print("#");
	    	  }
	    	  System.out.println("");
	      }
	}

}
