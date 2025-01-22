package ArraysLab;

import java.util.Scanner;

public class ReverseArrayStrings04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] text = scanner.nextLine().split(" ");

        for (int i = text.length - 1; i >= 0 ; i--) {
            System.out.print(text[i] + " ");
        }


    }

}
