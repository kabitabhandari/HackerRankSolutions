import java.util.*;

public class DesignerPdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        List<Integer> arrayListToFindLargest = new ArrayList<>();
        char a = 'a';
        int asciiValueOfA = a;
        for(int j=0; j<word.length(); j++){
            char eachLetter = word.charAt(j);
            int eachLetterAsciiValue = eachLetter;
            arrayListToFindLargest.add(h.get(eachLetterAsciiValue - asciiValueOfA));
        }
        System.out.println(arrayListToFindLargest);
        return Collections.max(arrayListToFindLargest) * word.length();
    }

    public static void main(String[] args){
        Integer[] value = {1,3,1,3,1,4,1,3,2,5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        List<Integer> h = Arrays.asList(value);
        String word ="abc";
        System.out.println(designerPdfViewer(h, word));;
        char a ='q';
        System.out.println((int)a);
    }
}
