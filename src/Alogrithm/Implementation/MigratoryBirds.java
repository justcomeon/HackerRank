package Alogrithm.Implementation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/*
 * https://www.hackerrank.com/challenges/migratory-birds?h_r=next-challenge&h_v=zen
 */
import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
        
        Map<Integer, Integer> groupedValues = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
        	if(groupedValues.get(types[i])==null){
        		groupedValues.put(types[i], 1);
        	}
        	else {
				groupedValues.put(types[i], (groupedValues.get(types[i]))+1);
			}
        }
        
        //Í³¼Æ
       int maxKey = 0;
       int maxValue = 0;
       
       for(Integer key : groupedValues.keySet()){
    	   if(groupedValues.get(key)>maxValue){
    		   maxValue = groupedValues.get(key);
    		   maxKey = key;
    	   }
       }
       
   
       System.out.println(maxKey);
        
	}

}
