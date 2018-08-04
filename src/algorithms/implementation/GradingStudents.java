package algorithms.implementation;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * Created by Mohammed Fathy @ 28/04/2018
 * dev.mfathy@gmail.com
 * <p>
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {

        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38 && grades[i] >= 0) result[i] = grades[i];
            else if (grades[i] >= 38 && grades[i] <= 100) {
                int multiple = (int) (5 * (Math.ceil(Math.abs(grades[i] / 5))) + 5);
                int diff = multiple - grades[i];
                result[i] = diff < 3 ? multiple : grades[i];
            }
        }

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
