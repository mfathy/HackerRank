package algorithms.interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * Created by Mohammed Fathy @ 04/08/2018
 * dev.mfathy@gmail.com
 * <p>
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int minimumTrade = 0;
        int[] target = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            target[i] = i + 1;
        }



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] q = new int[n];
//
//            String[] qItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int qItem = Integer.parseInt(qItems[i]);
//                q[i] = qItem;
//            }

        int q[] = {2, 1, 5, 4, 3};
        minimumBribes(q);
//        }

//        scanner.close();
    }
}
