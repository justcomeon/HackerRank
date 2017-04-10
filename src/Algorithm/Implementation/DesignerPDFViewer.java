package Algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/designer-pdf-viewer?h_r=next-challenge&h_v=zen
 */
public class DesignerPDFViewer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		
		//my code goes here
		char[] word_arr = word.toCharArray();
		int width = word_arr.length;
		int height = 0;
		
		int[] word_heightArr = new int[width];
		
		for(int c_i = 0; c_i < word_arr.length; c_i++) {
			word_heightArr[c_i] = h[(int)word_arr[c_i]-97];
		}
		Arrays.sort(word_heightArr);
		height = word_heightArr[word_heightArr.length-1];
		
		//System.out.println("width="+width+" height="+height);
		System.out.println(width*height);
		
		
	}

}
