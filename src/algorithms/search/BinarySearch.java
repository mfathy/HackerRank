package algorithms.search;

/**
 * Created by Mohammed Fathy @ 26/05/2018
 * dev.mfathy@gmail.com
 */
public class BinarySearch {

    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    int min = 0;
    int max = primes.length - 1;
    int step = 0;

    void binarySearch(int targetValue) {

        System.out.println("Guess number: " + ++step);

        if (max < min) {
            System.out.println("Target is not present in array.");
            return;
        }

        int guess = Math.abs((min + max) / 2);

        if (primes[guess] == targetValue) {
            System.out.println("Found it.");
            return;
        } else if (primes[guess] < targetValue) {
            min = guess++;
        } else if (primes[guess] > targetValue) {
            max = guess--;
        }

        binarySearch(targetValue);

    }

    public static void main(String args []) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(3);
    }

}
