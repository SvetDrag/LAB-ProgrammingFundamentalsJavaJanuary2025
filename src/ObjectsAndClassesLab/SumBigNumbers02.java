package ObjectsAndClassesLab;

import java.util.Scanner;
import java.math.BigInteger;

public class SumBigNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = scanner.nextBigInteger();
        BigInteger secondNum = scanner.nextBigInteger();

        System.out.println(firstNum.add(secondNum));


    }
}
