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
    private static void minimumBribes(int[] q) {
        int bribe = 0;
        boolean chaotic = false;

        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            } else {
                for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                    if (q[j] > q[i])
                        bribe++;
                }
            }
        }

        if (chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
