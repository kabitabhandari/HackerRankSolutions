import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        System.out.println(a);
    return 0;
    }

    public static void main(String[] args) {
        Integer[] number = {4,6,5,3,3,1};
        List<Integer> ar = Arrays.asList(number);
        System.out.println(pickingNumbers(ar));
    }
}
