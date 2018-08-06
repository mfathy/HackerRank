package algorithms.interview.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps2 {

    private static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int indexToBeSwapped = findItemToBeSwapped(arr, i + 1);
                if (indexToBeSwapped != 0) {
                    swap(arr, i, indexToBeSwapped);
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    private static int findItemToBeSwapped(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (i == arr[j]) return j;
        }
        return 0;
    }


    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
