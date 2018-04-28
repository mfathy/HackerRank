package algorithms.warmup;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * Created by Mohammed Fathy @ 27/04/2018
 * dev.mfathy@gmail.com
 * <p>
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        DecimalFormat df2 = new DecimalFormat("##");
        String dayOrNight = s.substring(s.length() - 2, s.length());
        String[] time24 = s.split(":", 3);
        int diff = 0;
        if (dayOrNight.toLowerCase().equals("pm")) diff = 12;
        if (dayOrNight.toLowerCase().equals("pm") && time24[0].equals("12")) diff = 0;
        if (dayOrNight.toLowerCase().equals("am") && time24[0].equals("12")) diff = 12;

        int hours = Integer.parseInt(time24[0]) + diff;
        if (hours == 24) hours = 0;
        time24[0] = String.format("%02d", hours);

        return time24[0] + ":" + time24[1] + ":" + (time24[2].toLowerCase()).replace("PM".toLowerCase(), "").replace("AM".toLowerCase(), "");


    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();

//        System.out.println(timeConversion("12:05:39AM"));
    }
}


