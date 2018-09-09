package algorithms.interview.honeypot;

import java.util.*;

/**
 * Created by Mohammed Fathy @ 8/12/2018
 * dev.mfathy@gmail.com
 * <p>
 */
public class BiggerArraySolution {
    static List<Integer> rearrange(List<Integer> elements) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> tempMap = new HashMap<>();
        for (Integer element : elements) {
            tempMap.put(Integer.toBinaryString(element), getOneCount(Integer.toBinaryString(element)));
        }

        Map<String, Integer> sortedMap = sortByValue(tempMap);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()){
            result.add(Integer.parseInt(String.valueOf(entry.getKey()), 2));
        }
        return result;
    }

    private static Integer getOneCount(String toBinaryString) {
        Integer resultCount = 0;
        for (int i = 0; i < toBinaryString.length(); i++) {
            if (toBinaryString.charAt(i) == '1') {
                resultCount++;
            }
        }
        return resultCount;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());


        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }


    public static void main (String args []) {
        List<Integer>  integers = new ArrayList<>();
        integers.add(7);
        integers.add(8);
        integers.add(6);
        integers.add(5);
        List<Integer> rearrange = rearrange(integers);

        System.out.println(rearrange);
    }
}
