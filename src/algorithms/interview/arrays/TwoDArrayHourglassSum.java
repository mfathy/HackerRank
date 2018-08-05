package algorithms.interview.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Mohammed Fathy @ 04/08/2018
 * dev.mfathy@gmail.com
 * <p>
 * Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.
 * https://www.hackerrank.com/challenges/2d-array/problem
 */
public class TwoDArrayHourglassSum {

    // Complete the hourglassSum function below.
    private static int hourglassSum(int[][] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                if (arr[i][j] >= -9 && arr[i][j] <= 9) {
                    int sum = (arr[i][j] + arr[i][j + 1] +
                            arr[i][j + 2]) + (arr[i + 1][j + 1]) +
                            (arr[i + 2][j] + arr[i + 2][j + 1] +
                                    arr[i + 2][j + 2]);

                    if (i == 0 && j == 0) maxSum = sum;
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];
//        int[][] arr = {{1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0}, {0,0,2,4,4,0}, {0,0,0,2,0,0}, {0,0,1,2,4,0}};
//        int[][] arr = {{-1,-1,0,-9,-2,-2}, {-2,-1,-6,-8,-2,-5}, {-1,-1,-1,-2,-3,-4}, {-1,-9,-2,-4,-4,-5}, {-7,-3,-3,-2,-9,-9}, {-1,-3,-1,-2,-4,-5}};

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}