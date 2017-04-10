package Days30OfCode;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day26_NestedLogic {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		
		Scanner in = new Scanner(System.in);
//
//		int returnedDate = in.nextInt();
//		int returnedMonth = in.nextInt();
//		int returnedYear = in.nextInt();
//		int expectedDate = in.nextInt();
//		int expectedMonth = in.nextInt();
//		int expectedYear = in.nextInt();
		int fine = 0;
		int returnedDate = 9;
		int returnedMonth = 6;
		int returnedYear = 2015;
		int expectedDate = 6;
		int expectedMonth = 6;
		int expectedYear = 2015;
		
//		GregorianCalendar returned = new GregorianCalendar();
//		returned.set(returnedYear, returnedMonth, returnedDate);
//		GregorianCalendar expected = new GregorianCalendar();
//		expected.set(expectedYear, expectedMonth, expectedDate);
		
		Calendar expected = new GregorianCalendar();
		Date expected_date = new Date(expectedYear, expectedMonth, expectedDate);
		expected.setTime(expected_date);
		
		Calendar returned = new GregorianCalendar();
		Date returned_date = new Date(returnedYear, returnedMonth, returnedDate);
		returned.setTime(returned_date);
		
		int days =  returned.get(Calendar.DAY_OF_YEAR) - expected.get(Calendar.DAY_OF_YEAR);
		int days1 = returned.get(Calendar.DAY_OF_MONTH) - expected.get(Calendar.DAY_OF_MONTH);

		System.out.println(days+" "+days1);
		
		
	}

}
