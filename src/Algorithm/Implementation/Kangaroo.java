package Algorithm.Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import org.omg.PortableServer.ServantActivator;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		Kangaroo test = new Kangaroo();
		
		test.checkKangaroo(v1, v2, x1, x2);

	}

	 void checkKangaroo(int v1, int v2, int x1, int x2) {
		System.out.println(x1 + " " + x2);

		if ((x1 > x2 && v1>=v2) || (x1<x2 && v1<=v2)){
			System.out.println("NO");
			return;
		}
			

		if (x1 == x2) {
			System.out.println("YES");return;
		} else {
			// jump
			x1 += v1;
			x2 += v2;
			checkKangaroo(v1, v2, x1, x2);
		}
		return;

		/*
		 * 
		 * ������Ǳ�������ͬ���Ĳ��� ��������ⲽ��
		 * 
		 * 
		 * //�ȿ�x1��x2�ĸ���ǰ�� //�ں�������� System.out.println(x1+" "+x2); if(x1>x2){
		 * //x1����ǰ�� x2���� Ȼ��Ƚ� System.out.println("x1>x2"); x2+=v2; if(x1==x2)
		 * return true; else checkKangaroo(v1, v2, x1, x2); } else {
		 * System.out.println("x2>x1"); //x2��ǰ�棬x1���� x1+=v1; if(x1==x2) return
		 * true; else checkKangaroo(v1, v2, x1, x2); } if(x1>=10000 &&
		 * x2>=10000) { System.out.println("chao jie"); return false; }
		 * 
		 * return true;
		 * 
		 */
	}
}
