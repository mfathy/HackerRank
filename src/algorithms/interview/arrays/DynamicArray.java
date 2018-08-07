package algorithms.interview.arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Mohammed Fathy @ 8/7/2018
 * dev.mfathy@gmail.com
 * <p>
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 */
public class DynamicArray {
    /* Complete the dynamicArray function below. */
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastNumber = 0;
        List<Integer>[] sequences = new List[n];
        for (int i = 0; i < n; i++) {
            sequences[i] = new ArrayList<>();
        }
        List<Integer> lastAnswers = new ArrayList<>();
        for (List<Integer> query : queries) {
            int x = query.get(1);
            int y = query.get(2);
            List<Integer> sequence = sequences[(x ^ lastNumber) % n];
            switch (query.get(0)) {
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastNumber = sequence.get(y % sequence.size());
                    lastAnswers.add(lastNumber);
                    break;
            }
        }
        return lastAnswers;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            System.out.print((String.valueOf(result.get(i))));

            if (i != result.size() - 1) {
                System.out.println(" ");
            }
        }
        bufferedReader.close();
    }
}
