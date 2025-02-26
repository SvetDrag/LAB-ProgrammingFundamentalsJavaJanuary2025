package AssociativeArrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List> synonymsMap = new HashMap<>();


        for (int i = 0; i < 3 ; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymsMap.containsKey(word)){
                
            }

        }







    }
}
