package MethodsLab;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        //•	"coffee" – 1.50
        //•	"water" – 1.00
        //•	"coke" – 1.40
        //•	"snacks" – 2.00
        resultPrint(product, quantity);




    }


    public static void resultPrint(String product, int quantity){
        double sum = 0.0;
        int total = 0;

        if (product.equals("coffee")){
            sum = quantity * 1.5;
            System.out.printf("%.2f", sum);
        }
        else if (product.equals("water")){
            sum = quantity * 1.00;
            System.out.printf("%.2f", sum);
        }
        else if (product.equals("coke")){
            sum = quantity * 1.40;
            System.out.printf("%.2f", sum);
        }
        else if (product.equals("snacks")){
            sum = quantity * 2.00;
            System.out.printf("%.2f", sum);
        }
    }

}
