package TextProcessingLab;

import java.util.Scanner;

public class ReverseString01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String word = scanner.nextLine();


        while (!word.equals("end")){
            String newWord = "";
            for (int i = word.length()-1; i >= 0 ; i--) {

                char newWordChars = word.charAt(i);
                newWord += newWordChars;
            }
            System.out.println(word + " = " + newWord);
            word = scanner.nextLine();
            newWord = "";
        }


    }
}
