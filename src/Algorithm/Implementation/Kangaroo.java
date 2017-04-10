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
		 * 上面的是必须在相同跳的步数 这个是任意步数
		 * 
		 * 
		 * //先看x1，x2哪个在前面 //在后面的先跳 System.out.println(x1+" "+x2); if(x1>x2){
		 * //x1在先前， x2先跳 然后比较 System.out.println("x1>x2"); x2+=v2; if(x1==x2)
		 * return true; else checkKangaroo(v1, v2, x1, x2); } else {
		 * System.out.println("x2>x1"); //x2在前面，x1先跳 x1+=v1; if(x1==x2) return
		 * true; else checkKangaroo(v1, v2, x1, x2); } if(x1>=10000 &&
		 * x2>=10000) { System.out.println("chao jie"); return false; }
		 * 
		 * return true;
		 * 
		 */
	}
}
