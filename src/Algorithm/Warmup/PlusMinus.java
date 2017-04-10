package Algorithm.Warmup;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an array of integers, calculate which fraction of its elements
		 * are positive, which fraction of its elements are negative, and which
		 * fraction of its elements are zeroes, respectively. Print the decimal
		 * value of each fraction on a new line.
		 * 
		 * Note: This challenge introduces precision problems. The test cases
		 * are scaled to six decimal places, though answers with absolute error
		 * of up to are acceptable.
		 * 
		 * Output Format
		 * 
		 * You must print the following lines:
		 * 
		 * A decimal representing of the fraction of positive numbers in the
		 * array. A decimal representing of the fraction of negative numbers in
		 * the array. A decimal representing of the fraction of zeroes in the
		 * array.
		 */
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        //判断正负数
        float counter_p=0,counter_n=0,counter_z=0;
        for(int i:arr)
        {
        	if(i==0){
        		//System.out.println(i+" z+1");
        		counter_z++;
        	}
        		
        	else if(i>0){
        		//System.out.println(i+" p+1");

        		counter_p++;
        	}
        	else {
        		//System.out.println(i+" p+1");
        		counter_n++;
        	}
				
        }
        
        float result_p = counter_p/n;
        float result_n = counter_n/n;
        float result_z = counter_z/n;
        
       // System.out.println(counter_p+" "+counter_n+" "+counter_z);
        
        DecimalFormat df = new DecimalFormat("0.000000");
        //第一行 正数 第二行负数 第三行0
        System.out.println(df.format(result_p));
        System.out.println(df.format(result_n));
        System.out.println(df.format(result_z));

	}

}
