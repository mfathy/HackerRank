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
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {
    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {

        int n = a.length;
        int diag1 = 0;
        int diag2 = 0;

        int j = n - 1;
        for (int i = 0; i < n; i++){
            diag1 = diag1 + a[i][i];
            for (; j >= 0; --j) {
                diag2 = diag2 + a[i][j];
                break;
            }

            j--;
        }

        return Math.abs(diag1 - diag2);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
