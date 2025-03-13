package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(\\+359)([ -]{1})(2)\\2(\\d{3})\\2(\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> result = new ArrayList<>();

        while (matcher.find()){
            result.add(matcher.group());


        }

        System.out.print(String.join(", ", result));



    }
}
