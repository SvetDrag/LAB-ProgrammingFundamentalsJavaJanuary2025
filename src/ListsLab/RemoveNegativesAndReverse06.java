package ListsLab;

import java.sql.SQLSyntaxErrorException;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse06 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> possNum = new ArrayList<>();

        for (int n : numbers) {
            if (n > 0) {
                possNum.add(n);
            }
        }


        Collections.reverse(possNum);

        if (possNum.isEmpty()){
            System.out.println("empty");
        }
        else {
            for (int i = 0; i < possNum.size(); i++) {
                System.out.print(possNum.get(i) + " ");

            }
        }

    }
}
