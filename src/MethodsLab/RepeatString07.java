package MethodsLab;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeat(input, n));
    }

    public static String repeat(String input, int n){
        String result = "";
        for (int i = 1; i <= n ; i++) {

            result += input;
            //return result;
        }
        return result;
    }
}
