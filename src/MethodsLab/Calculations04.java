package MethodsLab;

import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //("add", "multiply", "subtract", "divide"

        String operation = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        resultPrint(operation, firstNum, secondNum);
    }

    public static void resultPrint(String operation, int firstNum, int secondNum) {
        if (operation.equals("add")){
            System.out.println(firstNum + secondNum);
        }
        else if (operation.equals("multiply")){
            System.out.println(firstNum * secondNum);
        }
        else if (operation.equals("substract")){
            System.out.println(firstNum - secondNum);
        }
        else if (operation.equals("divide")){
            System.out.println(firstNum / secondNum);
        }
    }
}
