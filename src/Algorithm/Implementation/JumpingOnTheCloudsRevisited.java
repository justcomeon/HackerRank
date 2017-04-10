package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
 */

public class JumpingOnTheCloudsRevisited {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int e = 100; // Energy level
		int n = in.nextInt(); // the number of clouds
		int k = in.nextInt(); // the jump distance (i+k)%n
		int c[] = new int[n]; // values of clouds
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		int nextPos = 0 + k % n;
		if (c[nextPos] == 0) {
			e = e - 1;
		} else {
			e = e - 1 - 2;
		}

		while (nextPos != 0) {
			nextPos = (nextPos + k) % n;
			if (c[nextPos] == 0) {
				e = e - 1;
			} else {
				e = e - 1 - 2;
			}
		}
		System.out.println(e);
	}
}
