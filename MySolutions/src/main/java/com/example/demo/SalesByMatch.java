/*
* There is a large pile of socks that must be paired by color.
* Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
* */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        List<Integer> lookupList = new ArrayList<>();
        int pair =0;
        int count =0;
        for(int i = 0; i < ar.size(); i++){
            if(!lookupList.contains(ar.get(i))) {
                for (int j = i; j < ar.size(); j++) {
                    if (ar.get(i) == ar.get(j)) {
                        lookupList.add(ar.get(i));

                        count++;
                    }
                }
                if (count % 2 == 0) {
                    pair = pair + count / 2;
                } else {
                    pair = pair + (count - 1) / 2;
                }
                count = 0;
            }
        }
        return  pair;
    }

    public static void main(String[] args) {
        int n= 7;
        Integer[] number = {2,2,2,1,1,3,4,4,4,4,4};
        List<Integer> ar = Arrays.asList(number);
        System.out.println(sockMerchant(n, ar));
    }
}
