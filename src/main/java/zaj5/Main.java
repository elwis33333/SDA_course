package zaj5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] split = "10 h 44 min".split(" h | min");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        System.out.println(hours);
        System.out.println(minutes);


        //////// wyrażenia regex
//        "account.?" >account, account1, account2, accountA
//        account_ < co jest w _
//        "account\\d" < jedna wartość liczbowa 0-9
//        "account\\*" < wiele cyfr
//         "account\\d{4}" < np. account4856
//         "\\+\\d{1,3}"  < +1 +48 -tak  +9999 - już nie
//         "\\d{2}\\.\\d{2}\\.\\d{4}"  -- data ale dzialaja zle daty
        String napis = "\\"; // to jest "\" ale w matcherze trzeba wpisać "\\\\" aby otrzymać "\" bo tak działa


        // typowe hasło 8 znaków
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])[a-zA-Z0-9@#$%^&+=]{8,}");
        Matcher account = pattern.matcher("ZdeF42c a@");
        if (account.matches()) {
            System.out.println("Tak, pasuje");
        }
        else {
            System.out.println("Nie, nie pasuje");
        }



        //szukanie 3 cyfr jedna po 2 w całym Stringu
         pattern = Pattern.compile("[\\d]{3}");
         account = pattern.matcher("aaaaaaaa765aaaaaaa11341aaaaaa");
        while(account.find()){
            System.out.println(account.group());
        }


        //hasło wer2
        String password = "asd#$%eee234wwewqqqqqqqqqASAA5";
        Pattern lowerCaseLatters = Pattern.compile("[a-z]+"); //+ to jeden lub więcej
        Matcher lowerCaseLattersMatcher = lowerCaseLatters.matcher(password);
        Pattern upperCaseLatters = Pattern.compile("[A-Z]+"); //+ to jeden lub więcej
        Matcher upperCaseLattersMatcher = upperCaseLatters.matcher(password);
        Pattern numbers = Pattern.compile("[0-9]+"); //+ to jeden lub więcej
        Matcher numbersMatcher = numbers.matcher(password);
        Pattern specials = Pattern.compile("[@#$%^&+=_]+"); //+ to jeden lub więcej
        Matcher specialsMatcher = specials.matcher(password);
        Pattern length = Pattern.compile(".{14,}"); //+ to jeden lub więcej
        Matcher lengthMatcher = length.matcher(password);
        if (lowerCaseLattersMatcher.find() && upperCaseLattersMatcher.find() && specialsMatcher.find() &&
                numbersMatcher.find() && lengthMatcher.find()) {
            System.out.println("Tak, pasuje");
        } else {
            System.out.println("Nie, nie pasuje");
        }

        // szzukanie w lorem ipsum ilości 5 znakowych wyrazów
         pattern = Pattern.compile("\\b[a-zA-Z]{5}\\b");
         account = pattern.matcher(WORDS);
        int licznik = 0;
        while(account.find()){
            licznik++;
        }
        System.out.println("W Lorem Ipsum znajduje się: "+licznik+" wyrazów");







    }
    private static String WORDS = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vitae mauris at mauris pulvinar interdum at eget dui. Aenean rutrum arcu ac libero bibendum, vulputate dignissim nunc tempus. Nulla facilisi. Etiam non nisi lobortis, vulputate neque eget, imperdiet metus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vitae lacus quis nunc congue congue. Integer fermentum tincidunt iaculis. Nulla pulvinar volutpat condimentum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque dui ligula, pulvinar ac sem sit amet, venenatis sagittis lectus.\n" +
            "\n" +
            "In viverra id justo vel euismod. Quisque fermentum ex ac nibh mattis pharetra. Donec aliquet, sapien ut semper sodales, elit ligula iaculis diam, auctor auctor justo nibh sit amet orci. Fusce tempus interdum quam, a vehicula quam porta vel. Praesent rhoncus nunc vitae mi eleifend, eu semper augue ullamcorper. Suspendisse libero dolor, luctus sit amet ligula nec, iaculis consequat metus. Duis vestibulum pellentesque mollis. Duis dictum feugiat sollicitudin. Cras eget ex pharetra enim iaculis malesuada ultrices vel eros.\n" +
            "\n" +
            "Nullam eu libero vulputate nibh dictum bibendum eu quis mauris. Suspendisse eget nulla et tortor ultrices feugiat. Nam aliquet nibh et ligula porttitor venenatis non sit amet lorem. Ut blandit elit ante, ut sodales dolor congue a. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Vestibulum finibus dui sed nulla posuere, ut ullamcorper quam mattis. Praesent condimentum ultrices massa, eu dignissim sem efficitur consectetur. Donec facilisis eros ultricies velit venenatis malesuada. Suspendisse nisl magna, vulputate id scelerisque ac, aliquam quis ipsum. Pellentesque vulputate vestibulum suscipit.\n" +
            "\n" +
            "Integer a auctor ex. Sed sed nisl vel nulla sodales tempus. Etiam ut mi luctus, commodo neque ac, dapibus mi. Curabitur porta ultricies nunc, pulvinar molestie massa tincidunt quis. Vestibulum elementum, odio sed malesuada rutrum, lacus libero placerat sapien, quis accumsan massa ligula in libero. Vestibulum id molestie lacus. Aliquam non massa eget sem congue fermentum non at felis. Donec ornare convallis ante, sit amet euismod turpis viverra nec. Quisque massa odio, molestie ac fringilla eget, hendrerit eget leo. Aliquam rhoncus dui erat, in egestas erat rutrum vel.\n" +
            "\n" +
            "Vivamus dictum ultricies mattis. Phasellus gravida turpis ac turpis eleifend, vitae bibendum justo ornare. Ut sed ex a mauris scelerisque tristique. Sed placerat gravida dignissim. Pellentesque commodo nibh quis metus efficitur mollis eget at est. Integer hendrerit, purus at vestibulum cursus, justo nisl condimentum eros, volutpat ullamcorper urna diam in ipsum. Suspendisse ac magna tincidunt ex ultricies varius. Praesent iaculis leo eros, sit amet sagittis mauris ornare quis. Phasellus ornare mauris metus, non ultricies augue fringilla ut. Ut sed venenatis diam, sed finibus leo. Praesent consequat cursus fermentum.";
}


