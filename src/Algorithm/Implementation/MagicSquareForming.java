package Algorithm.Implementation;

import java.util.Scanner;

/**
 * @author Crispin Wang
 * @date 2017年4月5日 下午8:24:04
 * @ClassName: MagicSquareForming
 * @Description: 
 *               https://www.hackerrank.com/challenges/magic-square-forming?h_r=next
 *               -challenge&h_v=zen
 */
public class MagicSquareForming {
	final static int[][][] MAGIC_SQUARE = {
			{{8,1,6},{3,5,7},{4,9,2}},
			{{6,1,8},{7,5,3},{2,9,4}},
			{{4,9,2},{3,5,7},{8,1,6}},
			{{2,9,4},{7,5,3},{6,1,8}},
			{{6,7,2},{1,5,9},{8,3,4}},
			{{8,3,4},{1,5,9},{6,7,2}},
			{{2,7,6},{9,5,1},{4,3,8}},
			{{4,3,8},{9,5,1},{2,7,6}}
	};

	/**
	 * @Title: main
	 * @Description: TODO(Description)
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		int[][] matrix = new int[3][3];
		Scanner in = new Scanner(System.in);
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				matrix[row][col] = in.nextInt();
			}
		}

//		printArray(matrix);
//		if (isMagicSquare(matrix)) {
//			System.err.println("Yes, it is!");
//		}
//		else {
//			System.out.println("No, it isnot");
//		}
		System.out.println(formMagicSquare(matrix));

	}

	/**
	 * @Title: printArray
	 * @Description: TODO(Description)
	 * @param @param array
	 * @return void
	 * @throws
	 */
	public static void printArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println("");
		}
	}

	/**
	 * @Title: formMagicSquare
	 * @Description: TODO(Description)
	 * @param @param array
	 * @param @return
	 * @return int
	 * @throws
	 */
	public static int formMagicSquare(int[][] array) {

		int res = 81; // minimus value

		for (int i = 0; i < MAGIC_SQUARE.length; i++) {
			int change = 0; // values to form a magic square
			for (int j = 0; j < MAGIC_SQUARE[0].length; j++) {
				for (int k = 0; k < MAGIC_SQUARE[0][0].length; k++) {
					if (array[j][k] != MAGIC_SQUARE[i][j][k]) {
						change += Math.abs(MAGIC_SQUARE[i][j][k] - array[j][k]);
					}
				}
			}
			if (change < res)
				res = change;
		}

		return res;
	}

	/** 
	* @Title: isMagicSquare 
	* @Description: is a magic square?
	* @param @param array
	* @return boolean : true=magic square
	*/
	public static boolean isMagicSquare(int[][] array) {
		if (array[1][1] != 5)
			return false;
		if(calculateDiagonal(array, 0)!=15 || calculateDiagonal(array, 1)!=15)
			return false;
		for(int i = 0; i<3; i++) {
			if(calculateRow(array, i)!=15)
				return false;
			if(calculateColumn(array, i)!=15)
				return false;
		}
		return true;
	}

	/** 
	* @Title: calculateRow 
	* @Description: calculate the row line value
	* @param array: calculate the array
	* @param row : the row number
	* @return int : row value
	*/
	public static int calculateRow(int[][] array, int row) {
		return array[row][0] + array[row][1] + array[row][2];
	}

	/** 
	* @Title: calculateColumn 
	* @Description: calculate the column line value
	* @param array: calculate the array
	* @param col : the col number
	* @return int
	*/
	public static int calculateColumn(int[][] array, int col) {
		return array[0][col] + array[1][col] + array[2][col];
	}

	/** 
	* @Title: calculateDiagonal 
	* @Description: calculate the Diagonal value
	* @param array: calculate the array
	* @param direction: 0=left, 1=right
	* @return int
	*/
	public static int calculateDiagonal(int[][] array, int direction) {
		/* left diagonal */
		if (direction == 0) {
			return array[0][0] + array[1][1] + array[2][2];
		}
		/* right diagonal */
		else {
			return array[0][2] + array[1][1] + array[2][0];
		}
	}

}
