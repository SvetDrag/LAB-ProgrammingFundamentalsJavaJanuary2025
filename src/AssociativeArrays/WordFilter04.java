package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter04 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner (System.in);

         String [] words = Arrays.stream(scanner.nextLine()
                          .split(" ")).filter(word -> word.length() % 2 ==0)
                          .toArray(String [] :: new); //if lettes of word is even -> print

        for (String t : words){
            System.out.printf("%s ", t);
        }

        //Arrays.stream(words).forEach(System.out::print);



    }
}
