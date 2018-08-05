package algorithms.interview.arrays;

public class MinimumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    if (arr[i] - arr[j] > 1) {
                        swapCount++;
                    }
                }
            }
        }

        return swapCount;
    }

    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 2, 4, 6, 8};
//        int[] arr = {4, 3, 1, 2};
        int integer = minimumSwaps(arr);
        System.out.println(integer);
    }
}
