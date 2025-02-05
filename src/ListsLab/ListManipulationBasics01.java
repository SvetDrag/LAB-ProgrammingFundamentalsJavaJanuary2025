package ListsLab;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("end")){
            //•	Add {number} – add a number to the end of the list
            //•	Remove {number} – remove a number from the list
            //•	RemoveAt {index} – remove a number at a given index
            //•	Insert {number} {index} – insert a number at a given index


           //List<String> command1 = new ArrayList<>();

            if (command.contains("Add")){
                int numToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numToAdd);
            }
            else if (command.contains("RemoveAt")){
                int numToRemoveAt = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(numToRemoveAt);}
            else if (command.contains("Remove")) {
                int numToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(numToRemove));
            }
            else if (command.contains("Insert")){
                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int posToInsert = Integer.parseInt(command.split(" ")[2]);
                numbers.add(posToInsert, numToInsert);
            }


            command = scanner.nextLine();
        }

        for (int num : numbers){
            System.out.printf("%d ", num);
        }

    }
}
