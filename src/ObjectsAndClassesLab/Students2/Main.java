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

            if (isStudentExist(studentsList, firstName, lastName)){
                int index = getStudentIndex(studentsList, firstName, lastName);

                studentsList.get(index).setAge(age);
                studentsList.get(index).setHomeTown(homeTown);
            }
            else {
                Student student = new Student(firstName, lastName, age, homeTown);
                studentsList.add(student);
            }

            //Student student = new Student(firstName, lastName, age, homeTown);
            //studentsList.add(student);

            command = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentsList){
            if (student.getHomeTown().equals(city)){
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge() + " years old " );
            }

        }


    }

    private static boolean isStudentExist(List<Student> studentList, String firstName, String lastName){


        for (Student student : studentList){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;

    }

    private static int getStudentIndex(List<Student> studentList, String firstName, String lastName){

        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                index = i;
            }
        }
        return index;

    }
}
