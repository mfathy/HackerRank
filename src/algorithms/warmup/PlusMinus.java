package algorithms.warmup;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * Created by Mohammed Fathy @ 27/04/2018.
 * dev.mfathy@gmail.com
 *
 * https://www.hackerrank.com/challenges/plus-minus/problem
 *
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 *
 * Input Format
 *
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers describing an array of numbers .
 *
 * Output Format
 *
 * You must print the following  lines:
 *
 * A decimal representing of the fraction of positive numbers in the array compared to its size.
 * A decimal representing of the fraction of negative numbers in the array compared to its size.
 * A decimal representing of the fraction of zeros in the array compared to its size.
 *
 * Sample Input
 *
 * 6
 * -4 3 -9 0 4 1
 *
 * Sample Output
 *
 * 0.500000
 * 0.333333
 * 0.166667
 *
 * Explanation
 *
 * There are  positive numbers,  negative numbers, and  zero in the array.
 * The proportions of occurrence are positive: , negative:  and zeros: .
 * *
 */
public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        int countP = 0;
        int countN = 0;
        int countZ = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZ++;
            else if (arr[i] > 0) countP++;
            else if (arr[i] < 0) countN++;
        }

        System.out.println(String.valueOf((float) countP / arr.length));
        System.out.println(String.valueOf((float) countN / arr.length));
        System.out.println(String.valueOf((float) countZ / arr.length));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }

}
