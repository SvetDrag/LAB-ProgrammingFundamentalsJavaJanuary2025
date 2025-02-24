package ObjectsAndClassesLab.Students2;


import ObjectsAndClassesLab.Students.Student;

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
            String homeTown = command.split(" ")[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            studentsList.add(student);

            command = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentsList){
            if (student.getHomeTown().equals(city)){
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge() + " years old " );
            }

        }


    }
}
