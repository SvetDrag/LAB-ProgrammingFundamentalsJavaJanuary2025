package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        String regex = "\\b([A-Z]{1}[a-z]+)[ ]{1}([A-Z]{1}[a-z]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){


            System.out.print(matcher.group() + " ");

        }



    }
}
