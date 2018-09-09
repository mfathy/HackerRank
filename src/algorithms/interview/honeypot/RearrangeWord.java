package algorithms.interview.honeypot;

/**
 * Created by Mohammed Fathy @ 8/12/2018
 * dev.mfathy@gmail.com
 * <p>
 */
public class RearrangeWord {

    public static void main(String args []) {
        String result = rearrangeWord("baca");
        System.out.println(result);
    }

    private static String rearrangeWord(String word) {
        int maxL01 = 0; int maxL02 = 0;
        if(word.length()==1) return "no answer";
        for (int i = 1; i < word.length(); i++) {
            boolean isCharBigger =  word.charAt(i) > word.charAt(i -1);
            if (isCharBigger) maxL01 = (i > maxL01) ? i : maxL01;
        }

        if( maxL01 == 0 ) return "no answer";

        for(int j = maxL01; j < word.length(); j++) {
            boolean isCharBigger = word.charAt(j) > word.charAt(maxL01-1);
            if(isCharBigger) maxL02 = j;
        }

        StringBuilder result = new StringBuilder(word);

        char tmp = result.charAt(maxL01 - 1);
        result.setCharAt(maxL01-1, result.charAt(maxL02));
        result.setCharAt(maxL02, tmp);

        int left = maxL01;
        int right = result.length()-1;
        while(left < right) {
            tmp = result.charAt(left);
            result.setCharAt(left, result.charAt(right));
            result.setCharAt(right, tmp);
            left++;
            right--;
        }
        return result.toString();
    }


}
