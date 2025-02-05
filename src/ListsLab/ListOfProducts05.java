package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List <String> productsList = new ArrayList<>();


        for (int i = 1; i <= num ; i++) {

            String product = scanner.nextLine();
            productsList.add(product);

        }

        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n", i+1, productsList.get(i));
        }


    }
}
