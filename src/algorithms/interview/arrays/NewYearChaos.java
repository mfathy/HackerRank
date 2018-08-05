package algorithms.interview.arrays;

import java.util.Scanner;


/**
 * Created by Mohammed Fathy @ 04/08/2018
 * dev.mfathy@gmail.com
 * <p>
 * Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.
 * https://www.hackerrank.com/challenges/new-year-chaos/problem
 */

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int minimumTrade = 0;
        int chaoticCount = 0;
        int[] target = calculateTarget(q);

        for (int i = q.length; i == 0; i++) {

            if (q[i] == 3){
                System.out.print(q[i]);
            }
        }

    }

    private static int[] calculateTarget(int[] q) {
        int[] target = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            target[i] = i + 1;
        }
        return target;
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
