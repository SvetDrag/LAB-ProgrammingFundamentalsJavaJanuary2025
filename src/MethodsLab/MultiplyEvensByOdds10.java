package MethodsLab;
import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(getTotalSum(num));




    }

    public static int getTotalSum(int num){

        int evensSum = getEvensSum(num);
        int oddsSum = getOddsSum(num);
        int total = evensSum * oddsSum;
        return total;
    }

    public static int getEvensSum (int num){
        num = Math.abs(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    public static int getOddsSum (int num) {
        num = Math.abs(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 !=0) {
               sum += digit;
            }
            num /= 10;
        }
        return sum;
    }


}
