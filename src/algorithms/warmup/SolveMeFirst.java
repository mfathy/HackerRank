package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Mohammed Fathy @ 27/04/2018.
 * dev.mfathy@gmail.com
 *
 * Complete the function solveMeFirst to compute the sum of two integers.
 *
 * Function prototype:
 *
 * int solveMeFirst(int x, int y);
 *
 * where,
 *
 * x is the first integer input.
 * y is the second integer input
 * Return values
 *
 * sum of the above two integers
 * Sample Input
 *
 * x = 2
 * y = 3
 * Sample Output
 *
 * 5
 * Explanation
 *
 * The sum of the two integers  and  is computed as: .
 */
public class SolveMeFirst {



    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a+b;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

}
