package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Mohammed Fathy @ 27/04/2018
 * dev.mfathy@gmail.com
 *
 * Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            int stairCount = i;
            int spaceCount = n;
            String stairString = new String(new char[stairCount]).replace("\0", "#");
            System.out.println(String.format("%1$"+spaceCount+ "s", stairString));
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }

}
