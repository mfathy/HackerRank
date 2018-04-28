package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Mohammed Fathy @ 27/04/2018
 * dev.mfathy@gmail.com
 *
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MiniMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        long [] sums = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) sums[i] = sums[i] + arr[j];
            }


        }

        long minSum = sums[0];
        long maxSum = sums[0];

        for (int i = 0; i < arr.length; i++) {
            if (minSum > sums[i]) minSum = sums[i];
            if (maxSum < sums[i]) maxSum = sums[i];
        }

        System.out.print(minSum + " " + maxSum);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }

}
