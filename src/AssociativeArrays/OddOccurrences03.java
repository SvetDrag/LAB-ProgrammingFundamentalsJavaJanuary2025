package AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class OddOccurrences03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        String [] input = scanner.nextLine().split(" ");
        Map<String, Integer> count = new LinkedHashMap<>();

        for (String word : input){
            String wordLowerCase = word.toLowerCase();

            if(count.containsKey(wordLowerCase)){
                count.put(wordLowerCase, count.get(wordLowerCase) + 1);
            }
            else {
                count.put(wordLowerCase, 1);
            }

        }

        List <String> result = new ArrayList<>();

        for (Map.Entry<String, Integer>entry:count.entrySet()){

            if (entry.getValue() % 2 != 0 ) {
                result.add(entry.getKey());
            }

        }

        for (int i = 0; i < result.size() - 1; i++) {
            System.out.printf("%s, ", result.get(i));
        }
        System.out.printf("%s", result.get(result.size() - 1));





    }
}
