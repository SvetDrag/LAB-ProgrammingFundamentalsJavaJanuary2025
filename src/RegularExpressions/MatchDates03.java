package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        String regex = "(?<day>\\d{2})([-.\\/]{1})(?<month>[A-z]{3})\\2(?<year>\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        //List<String> result = new ArrayList<>();


        while (matcher.find()){

            //result.add(matcher.group());
            String[] text = matcher.group().split("[-.\\/]");
            System.out.printf("Day: %s, Month: %s, Year: %d%n", text[0], text[1], Integer.parseInt(text[2]));

        }



    }
}
