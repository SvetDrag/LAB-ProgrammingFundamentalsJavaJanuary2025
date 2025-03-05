package TextProcessingLab;

import java.util.Scanner;

public class RepeatString02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String [] input = scanner.nextLine().split(" ");
        String word = "";
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.print(input[j]);
            }
        }

    }
}
