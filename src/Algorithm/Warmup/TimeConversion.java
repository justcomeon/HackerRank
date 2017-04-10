package Algorithm.Warmup;
import java.util.Scanner;

/**
 * Created by Just on 2017-03-05.
 */

/*https://www.hackerrank.com/challenges/time-conversion?h_r=next-challenge&h_v=zen
Given a time in -hour AM/PM format, convert it to military (-hour) time.

Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:  or ), where  and .

Output Format

Convert and print the given time in -hour format, where .
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        String result = "";
        if (time.contains("AM") || time.contains("am")) {
            //AM condition, remove AM
            // if 12, then -12
            String[] timeElement = (time.substring(0, time.length() - 2)).split(":");
            int hour_num = Integer.valueOf(timeElement[0]);
            hour_num = hour_num == 12 ? 0 : hour_num;
            String time_temp = hour_num < 10 ? "0"+String.valueOf(hour_num) : String.valueOf(hour_num);
            timeElement[0] = time_temp;

            for (int i = 0; i < timeElement.length; i++) {
                if (i == (timeElement.length - 1)) {
                    // no :
                    result += timeElement[i];
                } else {
                    result += timeElement[i] + ":";
                }
            }

        } else {
            //PM condition
            String[] timeElement = (time.substring(0, time.length() - 2)).split(":");
            int hour_num = Integer.valueOf(timeElement[0]);
            hour_num = hour_num == 12 ? hour_num : hour_num + 12;

            hour_num = hour_num >= 24 ? (hour_num - 24) : hour_num;
            String time_temp = hour_num < 10 ? "0"+String.valueOf(hour_num) : String.valueOf(hour_num);
            timeElement[0] = time_temp;


            for (int i = 0; i < timeElement.length; i++) {
                if (i == (timeElement.length - 1)) {
                    // no :
                    result += timeElement[i];
                } else {
                    result += timeElement[i] + ":";
                }
            }

        }

        System.out.println(result);

    }
}
