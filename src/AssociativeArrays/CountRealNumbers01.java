package AssociativeArrays;


import java.util.*;

public class CountRealNumbers01 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner (System.in);

            int[] input = Arrays.stream(scanner.nextLine().split(" ")).
                            mapToInt(Integer::parseInt).
                            toArray();


            Map<Integer, Integer> numCount = new TreeMap<>();
            //int currentCount = 1;

            for (int number : input) {

                if (!numCount.containsKey(number)){
                    numCount.put(number, 1);
                }
                else {
                  int  currentCount = numCount.get(number);
                  numCount.put(number, currentCount + 1);

                }

            }

            for (Map.Entry<Integer, Integer> entry : numCount.entrySet()){
                System.out.println(entry.getKey() + " -> " + entry.getValue());

            }







    }
}
