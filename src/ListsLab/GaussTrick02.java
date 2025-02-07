package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

         List<Integer> num = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt).collect(Collectors.toList());

         printTheResult(num);

    }

    public static void printTheResult (List<Integer> num) {

        int numSize = num.size();
        int dividedByTwo = 0;
        int totalSum = 0;
        int operatorFinalNum = 1;

        if (numSize % 2 == 0) {
            dividedByTwo = numSize / 2;

            for (int i = 0; i < dividedByTwo; i++) {


                int firstNum = num.get(i);
                int secondNum = num.get(numSize - operatorFinalNum);
                totalSum = firstNum+secondNum;
                System.out.print(totalSum + " ");

                operatorFinalNum++;
            }

        }
        else {

            dividedByTwo = numSize / 2;

            for (int i = 0; i < dividedByTwo; i++) {
                int firstNum = num.get(i);
                int secondNum = num.get(numSize - operatorFinalNum);
                totalSum = firstNum+secondNum;
                System.out.print(totalSum + " ");

                operatorFinalNum++;
            }
            System.out.print(num.get(dividedByTwo));

        }
    }
}
