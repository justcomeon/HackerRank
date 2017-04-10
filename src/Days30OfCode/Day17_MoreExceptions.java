package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-more-exceptions
 */
public class Day17_MoreExceptions {
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator1 myCalculator = new Calculator1();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}
//Write your code here
class Calculator1 {
  public int power (int n, int p)throws Exception {
      if(n>=0 && p>=0) {
           return (int)Math.pow(n,p);           
      }
 throw new Exception("n and p should be non-negative");
     
  }
}