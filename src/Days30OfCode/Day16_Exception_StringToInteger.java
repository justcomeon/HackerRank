package Days30OfCode;

import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
 */

public class Day16_Exception_StringToInteger {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        try{
	            System.out.println(Integer.valueOf(S));
	        }
	        catch(Exception e){
	            System.out.println("Bad String");
	        }
	        
	        
	    }

}
