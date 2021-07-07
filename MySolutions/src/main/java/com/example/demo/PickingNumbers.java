/*
* Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to .
* */
import java.util.*;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index=a.get(i);
            frequency[index]=frequency[index]+1;
        }

        for (int i = 1; i <= a.size(); i++) {
            int t = frequency[i] + frequency[i - 1];
            result = Math.max(result,t);
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] number = {4,6,5,3,3,1,3};
        List<Integer> ar = Arrays.asList(number);
        System.out.println(pickingNumbers(ar));
    }
}
