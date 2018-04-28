package algorithms.warmup;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * Created by Mohammed Fathy @ 27/04/2018
 * dev.mfathy@gmail.com
 *
 * Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class AVeryBigSum {
    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
        long sum = 0;
        for (int i = 0; i < n ; i++) {
            sum = sum + ar[i];
        }
        return sum;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        long[] ar = new long[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            long arItem = Long.parseLong(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        long result = aVeryBigSum(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }

}
