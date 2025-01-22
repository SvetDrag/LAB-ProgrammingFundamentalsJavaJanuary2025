package ArraysLab;

import java.util.Scanner;

public class DayOfWeek1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int position = Integer.parseInt(scanner.nextLine());

        //String [] day = {"Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //System.out.println(day[position]);
        String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (position >= 1 && position <= 7) {
            System.out.println(day[position-1]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
