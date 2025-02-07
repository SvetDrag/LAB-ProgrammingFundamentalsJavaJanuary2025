package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         List<Integer> num = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt).collect(Collectors.toList());

         String command = scanner.nextLine();

         //•	Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
        //•	Print even – print all the numbers that are even separated by a space
        //•	Print odd – print all the numbers that are oddly separated by a space
        //•	Get sum – print the sum of all the numbers
        //•	Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
            while (!command.equals("end")){
                if (command.contains("Contains")){
                    int numToContains = Integer.parseInt(command.split(" ")[1]);

                    if (num.contains(numToContains)){
                        System.out.println("Yes");
                    }
                    else {
                        System.out.println("No such number");
                    }
                }
                else if (command.contains("Print even")) {
                    for (int i = 0; i < num.size(); i++) {
                        if (num.get(i) % 2 == 0) {
                            System.out.print(num.get(i) + " ");
                        }
                    }
                                         System.out.println();
                }
                else if (command.contains("Print odd")) {
                    for (int i = 0; i < num.size(); i++) {
                        if (!(num.get(i) % 2 == 0)) {
                            System.out.print(num.get(i) + " ");
                        }
                    }
                                        System.out.println();
                }
                else if (command.contains("Get sum")) {
                    int sum = 0;
                    for (int i = 0; i < num.size(); i++) {
                        sum += num.get(i);
                    }
                    System.out.println(sum);
                }
                else if (command.contains("Filter")) {
                    String operator = command.split(" ")[1];
                    int numOperator = Integer.parseInt(command.split(" ")[2]);
                    if (operator.equals("<")) {
                        for (int i = 0; i < num.size(); i++) {
                            if (num.get(i) < numOperator){
                                System.out.print(num.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (operator.equals(">")) {
                        for (int i = 0; i < num.size(); i++) {
                            if (num.get(i) > numOperator){
                                System.out.print(num.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (operator.equals(">=")) {
                        for (int i = 0; i < num.size(); i++) {
                            if (num.get(i) >= numOperator){
                                System.out.print(num.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (operator.equals("<=")) {
                        for (int i = 0; i < num.size(); i++) {
                            if (num.get(i) <= numOperator){
                                System.out.print(num.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }

                }
                command = scanner.nextLine();

            }

    }
}
