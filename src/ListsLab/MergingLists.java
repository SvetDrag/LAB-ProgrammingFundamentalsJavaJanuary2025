package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         List<Integer> firstLine = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int firstLineSize = firstLine.size();
        int secondLineSize = secondLine.size();
        int possFirst = 0;
        int possSecond = 0;

        if (firstLineSize > secondLineSize) {
            for (int i = 0; i < secondLineSize; i++) {

                System.out.print(firstLine.get(i)+ " ");
                System.out.print(secondLine.get(possSecond)+ " ");

                possFirst++;
                possSecond++;

            }
            int diff = firstLineSize - secondLineSize;
            for (int i = possFirst; i < firstLineSize; i++) {
                System.out.print(firstLine.get(i) + " ");
            }
        }

        else {
            for (int i = 0; i < firstLineSize; i++) {

                System.out.print(firstLine.get(i) + " ");
                System.out.print(secondLine.get(possSecond) + " ");
                possFirst++;
                possSecond++;
             }
            int diff = secondLineSize - firstLineSize;
            for (int i = possSecond; i < secondLineSize; i++) {
                System.out.print(secondLine.get(i) + " ");
            }
         }






    }
}
