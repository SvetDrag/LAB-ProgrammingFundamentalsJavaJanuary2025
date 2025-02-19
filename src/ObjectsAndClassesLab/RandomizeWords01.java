package ObjectsAndClassesLab;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomizeWords01 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // String [] input = scanner.nextLine().split(" ");
        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        Random random = new Random();

        for (int position1 = 0; input.size() > 0; position1++) {
            int position2 = random.nextInt(input.size());
            System.out.println(input.get(position2));
            input.remove(position2);
            //position1--;

        }


    }
}
