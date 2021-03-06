package algorithms.interview.arrays;

import java.io.*;
import java.util.*;

/**
 * Created by Mohammed Fathy @ 04/08/2018
 * dev.mfathy@gmail.com
 * <p>
 * Complete the function rotLeft in the editor below. It should return the resulting array of integers.
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class ArraysLeftRotation {

    // Complete the rotLeft function below.
    private static int[] rotLeft(int[] a, int d) {
        if (d >= 1 && d <= a.length) {
            for (int i = 0; i < d; i++) {
                a = moveOneElementLeft(a);
            }
        }
        return a;
    }

    private static int[] moveOneElementLeft(int[] a) {
        int firstIndex = a[0];
        int result[] = new int[a.length];
        System.arraycopy(a, 1, result, 0, a.length - 1);
        result[a.length - 1] = firstIndex;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] result = rotLeft(a, d);
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));
            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
