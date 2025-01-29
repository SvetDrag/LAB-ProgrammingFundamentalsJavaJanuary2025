package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double area = rectangleArea(length, width);

        System.out.printf("%.0f", area);

    }


    public static double rectangleArea(double length, double width){
        return length * width;
    }
}
