import java.util.*;

    class MigratoryBirds {
        public static int migratoryBirdss(List<Integer> arrays) {
            Map<Integer, Integer> map= createHashMap(arrays);
            return returnHighestvalueKeyFromMap(map);
        }

        public static Map<Integer, Integer> createHashMap(List<Integer> arrays) {
            Map<Integer, Integer> myHashMap = new HashMap<>();
            for (Integer i : arrays) {
                Integer retrievedValue = myHashMap.get(i); //get key
                if (retrievedValue == null) {
                    myHashMap.put(i, 1);
                }
                else {
                    myHashMap.put(i, retrievedValue + 1);
                }
            }
            return myHashMap;
        }

        public static int returnHighestvalueKeyFromMap(Map<Integer, Integer>  map){
            List<Integer> lookUpArrayForHAshMapHighestValueKey = new ArrayList<>();
            //Get max value in map
            int maxValueInMap=(Collections.max(map.values()));

            // Iterating Map and inserting highest values to an arraylist
            for (Map.Entry<Integer, Integer> x : map.entrySet()) {
                if(x.getValue() == maxValueInMap){
                    lookUpArrayForHAshMapHighestValueKey.add(x.getKey());
                }
            }
            //Get min value from an arraylist
            int minValueInArray = Collections.min(lookUpArrayForHAshMapHighestValueKey);
            return minValueInArray;
        }

        public static void main(String[] args) {
            List<Integer> arr = Arrays.asList(1,4,4,4,4,5,3,3,3,3,6,6);
            int result =  migratoryBirdss(arr);
            System.out.println("answer : " + result);
        }
    }
