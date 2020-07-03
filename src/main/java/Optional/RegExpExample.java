package Optional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {
    public static void main(String[] args) {
        //kompilujemy nowy wrzorzem
        Pattern compiledPattern = Pattern.compile("[ab]+c");

        Matcher exampleMatcher = compiledPattern.matcher("abc");
        System.out.println(exampleMatcher.matches());
        System.out.println(compiledPattern.matcher("aaaaabbbc").matches());
        System.out.println(compiledPattern.matcher("aabaabbbc").matches());
        System.out.println(compiledPattern.matcher("aadaabbbc").matches());
        System.out.println(compiledPattern.matcher("aaaaabbbccc").matches());
        System.out.println(compiledPattern.matcher("aaaaabbbccc").find());

        System.out.println("Kowalski, Andrzej; \"Java zaawansowana\"; 2019");
//Kowalski, Andrzej; "Java zaawansowana"; 2019
        Pattern compiledGroupPattern = Pattern.compile("(\\w+), (\\w+); \"([a-zA-Z0-9 ]+)\"; (\\d+)");
        Matcher matcherWithGroup = compiledGroupPattern.matcher("Kowalski, Andrzej; \"Java zaawansowana\"; 2019");
        System.out.println(matcherWithGroup.matches());
        System.out.println(matcherWithGroup.group(1));
        System.out.println(matcherWithGroup.group(2));
        System.out.println(matcherWithGroup.group(3));
        System.out.println(matcherWithGroup.group(4));
        System.out.println(matcherWithGroup.groupCount());
        System.out.println(matcherWithGroup.group(0));
        Pattern datePattern2 = Pattern.compile("(\\d{4}[- /\\.](0[1-9]|1[012])[- /\\.](0[1-9]|[12][0-9]|3[01]))|((0[1-9]|[12][0-9]|3[01])[- /\\.](0[1-9]|1[012])[- /\\.]\\d{4})");
        Matcher dateMatcher = datePattern2.matcher("1778.12.20");
        System.out.println(dateMatcher.matches());
        System.out.println(datePattern2.matcher("17-12-2004").matches());




    }


}
