package algorithms.interview.arrays;

public class MinimumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            lastIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                    if (i == lastIndex) {
                        swapCount++;
                        lastIndex++;
                    }
                }

            }
        }

        return swapCount;
    }

    private static int[] swap(int[] arr, int i, int j) {
        int iValue = arr[i];
        int jValue = arr[j];
        arr[i] = jValue;
        arr[j] = iValue;
        return arr;
    }

    public static void main(String args[]) {
//        int[] arr = {1, 3, 5, 2, 4, 6, 8};
//        int[] arr = {4, 3, 1, 2};
        int[] arr = {2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19};
        int integer = minimumSwaps(arr);
        System.out.println(integer);
    }
}
