/*Two cats and a mouse are at various positions on a line. You will be given their starting positions.
  Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed.
  If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
  x = cat A position
  y = cat B position
  z = mouse position
  */

public class CatAndMouse {
    static String catAndMouse(int x, int y, int z) {
       int catAtoMouseDistance = x-z;
       int catBtoMouseDistance = y-z;
        if(Math.abs(catAtoMouseDistance) == Math.abs(catBtoMouseDistance)) {
            return "Mouse C";
        }

        if(Math.abs(catAtoMouseDistance) > Math.abs(catBtoMouseDistance)){
            return "Cat B";
        }

        if(Math.abs(catAtoMouseDistance) < Math.abs(catBtoMouseDistance)){
            return"Cat A";
        }
        return "";
    }
    public static void main(String[] args){
        System.out.println(catAndMouse(1,2,3));

    }
}
