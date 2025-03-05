package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder characters = new StringBuilder();

        for (char c : input.toCharArray()){
            if (Character.isDigit(c)){
                digits.append(c);
            }
            else if (Character.isLetter(c)){
                letters.append(c);
            }
            else {
                characters.append(c);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(characters);

    }
}
