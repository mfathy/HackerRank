package algorithms.search;

/**
 * Created by Mohammed Fathy @ 26/05/2018
 * dev.mfathy@gmail.com
 */
public class BinarySearch2 {

    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    void doSearch(int targetValue) {

        int min = 0;
        int max = primes.length - 1;
        int step = 0;
        int guess = 0;

        while (max >= min) {
            guess = Math.abs((min + max) / 2);
            System.out.println("Guess number: " + ++step);

            if (primes[guess] == targetValue) {
                System.out.println("Found it.");
                break;
            } else if (primes[guess] < targetValue) {
                min = guess++;
            } else {
                max = guess--;
            }
        }
    }

    public static void main(String args []){
        BinarySearch2 search2 = new BinarySearch2();
        search2.doSearch(3);
    }
}
