package MethodsLab;

import java.util.Scanner;

public class SignOfInteger01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //The number 2 is positive.

        int num = Integer.parseInt(scanner.nextLine());
        printNumType(num);


    }

    //Метод:

    public static void printNumType(int num) {
       //int num = Integer.parseInt(scanner.nextl).
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);

        }
        else if (num < 0) {
            System.out.printf("The number %d is negative.", num);

        }
        else {
            System.out.printf("The number %d is zero.", num);
        }
    }







}
