package Algorithm.Warmup;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Just on 2017-03-05.
 */
/*
https://www.hackerrank.com/challenges/mini-max-sum
Given five positive integers,
find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/
public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        //put all nums into an array
        long[] arr_nums = new long[5];
        arr_nums[0] = a;
        arr_nums[1] = b;
        arr_nums[2] = c;
        arr_nums[3] = d;
        arr_nums[4] = e;

        //sort the array
        Arrays.sort(arr_nums);

        long minisum = 0, maxsum = 0;
        //mini sum
        for (int i = 0; i < arr_nums.length - 1; i++) {
            minisum += arr_nums[i];
        }

        //max sum
        for (int i = 0; i < arr_nums.length - 1; i++) {
            maxsum += arr_nums[arr_nums.length - i-1];
        }
        System.out.println(minisum+" "+maxsum);

    }
}
