package MethodsLab;

import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.0f", resultPoweredNum(num, power));

    }


    public static double resultPoweredNum (int num, int power) {
        double result = Math.pow(num, power);
        return result;
    }



}
