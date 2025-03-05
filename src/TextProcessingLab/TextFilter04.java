package TextProcessingLab;

import java.util.Scanner;

public class TextFilter04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String [] bannedList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        String bannedWord = "";
        String asterisks = "";
        int bannedWordLength = 0;


        for (int i = 0; i < bannedList.length; i++) {
            bannedWord = bannedList[i];
            bannedWordLength = bannedWord.length();
            for (int j = 0; j < bannedWordLength; j++) {
                asterisks += "*";
            }


            text = text.replace(bannedWord, asterisks);
            asterisks = "";

        }

        System.out.println(text);


    }
}
