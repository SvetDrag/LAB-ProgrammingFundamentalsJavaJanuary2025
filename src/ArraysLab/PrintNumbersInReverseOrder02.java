package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] number = new int[n];

        for (int i = 0; i  < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            number[i] = input;
        }

        for (int i = n-1; i >= 0 ; i--) {
            System.out.print(number[i] + " ");
        }

    }
}
