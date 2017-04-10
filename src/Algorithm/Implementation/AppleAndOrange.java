package Algorithm.Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        
        /*
        https://www.hackerrank.com/challenges/apple-and-orange
        Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the red region denotes his house, where  is the start point and  is the end point. The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point  and the orange tree is at point .
        */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int apple_count=0;
        int orange_count=0;
        
        //ËãÆ»¹û
        for(int i=0; i<apple.length; i++){
            int testA = a + apple[i];
            if(testA>=s && testA<=t){
                apple_count++;
            }
        }
        //ËãéÙ×Ó
        for(int i=0; i<orange.length; i++){
            int testO = b + orange[i];
            if(testO >= s && testO <=t)
                orange_count++;
        }
        System.out.println(apple_count);
        System.out.println(orange_count);
    }
}
