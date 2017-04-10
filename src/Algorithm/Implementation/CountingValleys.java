package Algorithm.Implementation;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/counting-valleys
 */

/**
 * @ClassName: CountingValleys
 * @Description: Solve Counting valleys problem
 * @date 2017年4月5日 下午7:31:23
 * @author Crispin Wang
 */
public class CountingValleys {

	/**
	 * @Title: main
	 * @Description: Program entry
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of steps in gary's hike
		int grade = 0; // now level
		int res = 0;	// the number of valleys
		in.nextLine();
		String path = in.nextLine(); // steps
		

		/* create steps array */
		char[] steps = path.toCharArray();

		/* read all steps */
		for (int steps_i = 0; steps_i < steps.length; steps_i++) {
			/* in case of U */
			if(steps[steps_i]=='U') {
				grade++;	//going up
			}
			/* in case of D */
			if(steps[steps_i]=='D') {
				grade--;	//going down
			}
			if(grade==0 && steps[steps_i]=='U') {
				res++;
			}
		}
		System.out.println(res);
	}
}
