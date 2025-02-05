package ListsLab;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <Integer> numList = new ArrayList<>();

        for (int i = 1; i <= 4 ; i++) {

            int num = Integer.parseInt(scanner.nextLine());
            numList.add(num);
        }

        Collections.sort(numList);

        for (int i = 0; i < numList.size(); i++) {
            System.out.printf("%d.%s%n", i+1, numList.get(i));
        }




    }
}
