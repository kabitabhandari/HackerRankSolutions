public class DrawingBook {
    public static int pageCount(int n, int p) {
        int count =0;

        //  start counting from first page
        if(p <= n/2 && p != 1){ // if size is less than half then count from first
            for(int i=2; i<=p; i++){ // loop: 4 if size =18
                count= count +1;
                i++;
            }
        }

         //  start counting from last page
        if(p > n/2 && n%2  == 0 && n != p) { // need to flip from back but total pages are even
                for (int i = n-1; i >= p; i--) {
                    count++;
                    i--;
                }
        }

        if(p > n/2 && n % 2 !=0 && n != p) { // need to flip from back but total pages are odd
            for (int i = n-2; i >= p; i--) {
                count++;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result =  pageCount(16,7);
        System.out.println("page flip is  : " + result);
    }

}
