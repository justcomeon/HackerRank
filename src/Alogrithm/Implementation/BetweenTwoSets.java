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

		// factorList��������b��ȫ����Լ��
		// ����Ҫ����������������A�Ĺ�����

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
		 * ���� ���Լ�� ��Ϊ��С�����������޵� ���Լ ���ľ��� ����b����С����
		 */

		// ��������b����С������

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