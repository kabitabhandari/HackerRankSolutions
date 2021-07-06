import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
       if(b>0){
           int brianTotal = 0;
           int annaTotal = 0;
           int total = 0;
           int refund = 0;

           for(int i=0; i<bill.size(); i++) {
               total = total + bill.get(i);
           }
           annaTotal = total/2 - bill.get(k)/2;
           if(annaTotal == b){
               System.out.println("Bon Appetit");
           }
           else{
               refund = b - annaTotal;
               System.out.println(refund);

           }

       }
    }

    public static void main(String[] args){
        Integer indexAnnaDidnotEat = 1;
        Integer brainChargedAnna = 8;

        Integer[] arr = {3,10,2,9};

        bonAppetit(Arrays.asList(arr),indexAnnaDidnotEat,brainChargedAnna);

    }
}
