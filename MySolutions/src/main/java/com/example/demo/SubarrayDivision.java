/*
* Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
* */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum =0;

        if(d<m){
            return count;
        }

        for(int i =0; i < s.size(); i++){

            for (int j = i; j<m+i && j < s.size(); j++){
                sum = sum + s.get(j);

            }

            if(sum == d){
                count ++;
            }
            sum =0;

        }
        return count;
    }
    public static void main(String[] args){
        List<Integer> s = Arrays.asList(1,2,1,3,2);
        int d = 3;  // total sum
        int m = 2;  // cells
        System.out.println(birthday(s,d,m));
    }
}
