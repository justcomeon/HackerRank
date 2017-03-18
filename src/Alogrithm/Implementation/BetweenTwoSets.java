package Alogrithm.Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ServantActivator;

public class BetweenTwoSets {
	/*
	 * https://www.hackerrank.com/challenges/between-two-sets
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}

		int count = 0;

		int smallestFactor = findMinNum(b);
		List<Integer> FactorList = new ArrayList<>();
		for (int i = 1; i <= smallestFactor; i++) {
			boolean isFactor = true;
			for (int j = 0; j < b.length; j++) {
				if (b[j] % i != 0) {
					isFactor = false;
				}
			}
			if (isFactor)
				FactorList.add(i);
		}

		// factorList里是数组b的全部公约数
		// 现在要从这里找属于数组A的公倍数

		for (int f : FactorList) {
			boolean isNeeded = true;
			for (int i = 0; i < a.length; i++) {
				if (f % a[i] != 0)
					isNeeded = false;
			}
			if (isNeeded) {
				System.out.println(f);
				count++;
			}

		}

		System.out.println(count);

		//

		/*
		 * 先找 最大公约数 因为最小公倍数是无限的 最大公约 最大的就是 数组b里最小的数
		 */

		// 先找数组b里最小的数字

	}

	public static int findMinNum(int[] nums) {

		int miniNum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < miniNum)
				miniNum = nums[i];
		}
		return miniNum;
	}
}