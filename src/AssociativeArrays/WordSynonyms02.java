package AssociativeArrays;

import java.util.*;

public class WordSynonyms02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> synonymsMap = new LinkedHashMap<>();


        for (int i = 0; i < n ; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymsMap.containsKey(word)){
                synonymsMap.put(word, synonym);
            }
            else {
                String currentSynonym = synonymsMap.get(word);
                synonymsMap.put(word, currentSynonym + ", " + synonym);
            }

        }

        for (Map.Entry<String, String> entry : synonymsMap.entrySet()){

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }







    }
}
