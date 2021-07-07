public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int noOfValleys = 0;
        int count = 0;

        // using simple for-loop
        for (int i = 0; i < steps; i++) {
            char eachLetter = path.charAt(i);
            if (eachLetter == 'U'){
                count++;
            }
            if (eachLetter == 'D'){
                count--;
            }
            if (count == 0 && eachLetter == 'U'){  // should be coming towards sealevel by up path
                noOfValleys ++;
                count =0;
            }
        }

        return noOfValleys;
    }

    public static void main(String[] args){
        System.out.println(countingValleys(8, "UDDDUDUU"));

    }
}
