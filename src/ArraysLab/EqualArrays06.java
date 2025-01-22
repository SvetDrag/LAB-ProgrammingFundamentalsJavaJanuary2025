package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] Firstnumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] Secondnumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int leght = Firstnumbers.length;
        int sum = 0;

        for (int i = 0; i < leght; i++) {
            int number1 = Firstnumbers[i];
            int number2 = Secondnumbers[i];

            if (number1 == number2) {
                sum = number1 + number2;
            }
            else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);

    }
}
