package TextProcessingLab;

import java.util.Scanner;

public class Substring03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        int index = 0;
        while (!(index == -1)){
            secondLine = secondLine.replace(firstLine, "");
            index = secondLine.indexOf(firstLine);
        }
        System.out.println(secondLine);

    }
}
