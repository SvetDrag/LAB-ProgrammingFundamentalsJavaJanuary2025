package MethodsLab;

import java.util.Scanner;

public class PrintTriangle03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());
        printTriangle(num);

    }

    public static void numPrint(int num) {

        for (int j = 1; j <= num ; j++) {
            for (int k = 1; k <= num ; k++) {
                System.out.println(j + k);
            }

        }
    }

    public static void printTriangle(int num) {

        for (int i = 1; i <= num; i++) {
            printLine(i);
        }

        for (int i = num - 1; i >= 1; i--) {
            printLine(i);
        }
    }

    public static void printLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }





}
