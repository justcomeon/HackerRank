package Algorithm.Warmup;

import java.util.Arrays;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 */

public class BirthdayCakeCandles {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int h = height[height.length-1];
        int pos = 0;
        for(int i=height.length-1; i>=0; i--) {
            if(height[i] == h)
                pos = i;
        }       
        System.out.println(height.length - pos);
    }

}
