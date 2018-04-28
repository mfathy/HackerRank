package algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Mohammed Fathy @ 27/04/2018
 * dev.mfathy@gmail.com
 * You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class BirthdayCakeCandles {
    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {

        int tallestCandleCount = 0;
        int firstH = ar[0];
        for (int i = 0; i < n; i++) {
            if (firstH == ar[i]){
                firstH = ar[i];
                tallestCandleCount++;
            } else if (firstH < ar[i]) {
                firstH = ar[i];
                tallestCandleCount = 0;
                tallestCandleCount++;
            }
        }

        return tallestCandleCount;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }

}
