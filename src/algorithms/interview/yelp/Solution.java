package algorithms.interview.yelp;

import java.util.*;

/**
 * Created by Mohammed Fathy @ 8/29/2018
 * dev.mfathy@gmail.com
 * <p>
 */
public class Solution {

    /**
     * List of businesses info where each element is a dictionary containing
     * id and rating. Sort the businesses by their rating in decreasing order.
     * Preserve the original ordering if two businesses have same rating.
     *
     * @param businesses List of BusinessInfo objects where BusinessInfo
     *                   is a class containing id and rating.
     * @return List of BusinessInfo sorted by rating in decreasing order
     * <p>
     * Example input:
     * [
     * {'id': 101, rating: 5},
     * {'id': 102, rating: 2},
     * {'id': 103, rating: 3},
     * {'id': 104, rating: 5},
     * {'id': 105, rating: 5},
     * ]
     * Expected output:
     * [
     * {'id': 101, rating: 5},
     * {'id': 104, rating: 5},
     * {'id': 105, rating: 5},
     * {'id': 103, rating: 3},
     * {'id': 102, rating: 2},
     * ]
     */
    public static List<BusinessInfo> sortBusinessesByRating(List<BusinessInfo> businesses) {
        for (int i = 0; i < businesses.size(); i++) {

            //  1st constraint.
            if (businesses.get(i).rating > 5 && businesses.get(i).rating < 1)
                continue;

            for (int j = i + 1; j < businesses.size(); j++) {
                if (businesses.get(i).rating < businesses.get(j).rating) {
                    Collections.swap(businesses, i, j);
                }
            }
        }
        return businesses;
    }

    public static void main(String args[]) {
        List<BusinessInfo> businessInfos = new ArrayList<>();
        businessInfos.add(new BusinessInfo(105, 5));
        businessInfos.add(new BusinessInfo(101, 5));
        businessInfos.add(new BusinessInfo(102, 2));
        businessInfos.add(new BusinessInfo(103, 3));
        businessInfos.add(new BusinessInfo(104, 5));

        printList(sortBusinessesByRating(businessInfos));
    }

    private static void printList(List<BusinessInfo> sortBusinessesByRating) {
        for (BusinessInfo info : sortBusinessesByRating) {
            System.out.println(info.toString());
        }
    }
}

