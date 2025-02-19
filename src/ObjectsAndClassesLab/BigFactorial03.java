package ObjectsAndClassesLab;


import java.util.Scanner;
import java.math.BigInteger;


public class BigFactorial03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        long num = Integer.parseInt(scanner.nextLine());
        BigInteger result = BigInteger.valueOf(0);

        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }

        System.out.println(factorial);

    }
}
