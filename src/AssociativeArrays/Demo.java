package AssociativeArrays;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map <String, Double> studentsGrades = new HashMap<String, Double>();


        //добавяне на записи в даден Map:
        studentsGrades.put("Zarko", 5.45);
        studentsGrades.putIfAbsent("Ivan", 3.75); // - добавя записа, ако НЯМА запис със същия ключ.

    }
}
