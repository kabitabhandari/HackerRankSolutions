
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = scores.get(0);
        int max = scores.get(0);
        int countMin = 0;
        int countMax = 0;

        List<Integer> countArrayList = new ArrayList<>();


        for(int i=1; i<scores.size();i++){
            if(min>scores.get(i)){
                min = scores.get(i);
                countMin++;
            }

            if(max<scores.get(i)){
                max = scores.get(i);
                countMax++;
            }

        }
        countArrayList.add(countMax);
        countArrayList.add(countMin);


        return countArrayList;

    }
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(10,5,20,20,4,5,2,25,1);
        System.out.println(breakingRecords(a));
    }
}
