package algorithms.interview.arrays;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Mohammed Fathy @ 8/7/2018
 * dev.mfathy@gmail.com
 * <p>
 */
// TODO: 8/7/2018 Not fully solved
public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long[] zArray = new long[n];

        long maxValue = 0;
        for (int[] query : queries) {
            int aA = query[0];
            int bB = query[1];
            int kK = query[2];


            for (int j = 0; j < zArray.length; j++) {
                if (j + 1 >= aA && j + 1 <= bB) {
                    zArray[j] = zArray[j] + kK;
                    if (maxValue < zArray[j]) maxValue = zArray[j];
                }
            }

        }

        return maxValue;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
