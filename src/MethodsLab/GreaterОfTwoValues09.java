package MethodsLab;

import java.util.Scanner;

public class GreaterОfTwoValues09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        //char a = scanner.nextLine()


        if (value.equals("int")){
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum, secondNum));
        }
        else if (value.equals("char")){
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
        }
        else if (value.equals("String")){
            String firstName = scanner.nextLine();
            String secondName = scanner.nextLine();
        }

    }

    public static int getMax (int firstNum, int secondNum){
        int maxNum = 0;

        if (firstNum > secondNum){
            maxNum = firstNum;
        }
        else {
            maxNum = secondNum;
        }
        return maxNum;
    }

    public static char getMax (char firstChar, char secondChar){
        char maxNum = '';

        if (firstNum > secondNum){
            maxNum = firstNum;
        }
        else {
            maxNum = secondNum;
        }
        return maxNum;
    }




}
