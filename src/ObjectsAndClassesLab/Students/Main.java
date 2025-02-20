package ObjectsAndClassesLab.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String command = scanner.nextLine();
        List <Student> studentsList = new ArrayList<>();

        while (!command.equals("end")){

            String firstName = command.split(" ")[0];
            String lastName = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);

            Student student = new Student(firstName, lastName, age);
            studentsList.add(student);



            command = scanner.nextLine();
        }


    }
}
