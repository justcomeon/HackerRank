package Alogrithm.Implementation;
/*
 * https://www.hackerrank.com/challenges/cats-and-a-mouse
 */

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class CatsAndaMouse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			//my code here
			if(x == y || Math.abs(x-z)== Math.abs(y-z)) {
				System.out.println("Mouse C");
				continue;
			}
			if(z > x && z > y)
				System.out.println(x>y?"Cat A":"Cat B");
			else if( z < x && z < y) {
				System.out.println(x>y?"Cat B":"Cat A");
			}
			else {
				System.out.println(Math.abs(x-z)>Math.abs(y-z)?"Cat B":"Cat A");
			}
		}
		
		
	}

}
