package Algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

import javax.management.monitor.Monitor;

/**
 * @ClassName: ElectronicsShop
 * @Description: 
 *               https://www.hackerrank.com/challenges/electronics-shop?h_r=next-
 *               challenge&h_v=zen
 * @date 2017年4月5日 下午8:00:47
 * @author Crispin Wang
 */
public class ElectronicsShop {
	/**
	 * @Title: main
	 * @Description: TODO(Description)
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt(); // money
		int n = in.nextInt(); // the number of keyboard brands
		int m = in.nextInt(); // the number of USB drive brands
		int usedMoney = 0;	// used money
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] pendrives = new int[m];
		for (int pendrives_i = 0; pendrives_i < m; pendrives_i++) {
			pendrives[pendrives_i] = in.nextInt();
		}

		/* Sort two arrays */
		Arrays.sort(keyboards);
		Arrays.sort(pendrives);

		/* can not buy any two */
		if ((keyboards[0] + pendrives[0]) > s) {
			System.out.println("-1");
			return;
		}
		
		/* can buy */
		for(int keyboard_i = 0; keyboard_i<keyboards.length; keyboard_i++) {
			for(int pendrive_i = 0; pendrive_i<pendrives.length; pendrive_i++) {
				int temp = keyboards[keyboard_i]+pendrives[pendrive_i]; // used money
				if(temp > usedMoney && temp <= s) {
					usedMoney = temp;
				}
			}
		}
		System.out.println(usedMoney);
		

	}
}
