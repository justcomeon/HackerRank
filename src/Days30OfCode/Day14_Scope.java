package Days30OfCode;

import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/30-scope
 */

public class Day14_Scope {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
class Difference {
  	private int[] elements;
  	public int maximumDifference;
	// Add your code here
    public Difference(int[] a) {
        this.elements = a;
    }
    
    public void computeDifference () {
        int diff = 0; //max
        for(int i= 0; i< elements.length ; i++) {
            for(int j:this.elements) {
                if(Math.abs(elements[i]-j)>diff)
                    diff = Math.abs(elements[i]-j);
            }
        }
        this.maximumDifference = diff;
    }
        

}