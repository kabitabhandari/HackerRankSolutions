/*
* Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
* */
import java.util.*;

public class SubarrayDivisionUsingHashMap {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int pair = 0;
        int count = 0;
        List<Integer> lookupList = new ArrayList<>();

        for (int i = 0; i < ar.size(); i++) {
            if(!lookupList.contains(ar.get(i))) {
                for (int j = i; j < ar.size(); j++) {
                    if (ar.get(i) == ar.get(j)) {
                        lookupList.add(ar.get(i));

                        count++;
                    }
                }
                myMap.put(ar.get(i), count);
                count = 0;
            }

        }
        //printing hash map
        System.out.println("myMap is::::" + myMap);
        //iterating hash map
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            //System.out.println("map value : " + entry.getValue());
            if (entry.getValue() % 2 == 0) {
                pair = pair + entry.getValue() / 2;
            } else {
                pair = pair + (entry.getValue() - 1) / 2;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int n= 7;
        Integer[] number = {2,2,2,1,1};
        List<Integer> ar = Arrays.asList(number);
        System.out.println(sockMerchant(n, ar));
    }
}
