package zaj16_02.kg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b\\w{5}\\b");
        Pattern pattern2 = Pattern.compile("\\s\\w{5}[\\s,.]|\\G\\w{5}[\\s,.]");
        Pattern pattern3 = Pattern.compile("(?<!\\w)\\w{5}(?!\\w)");
        Matcher matcher = pattern.matcher(WORDS);
        Matcher matcher2 = pattern2.matcher(WORDS);
        Matcher matcher3 = pattern3.matcher(WORDS);
        int i=0;
        long time;
        long time2;
        time = System.nanoTime();
        while(matcher.find()){
            i++;
        }
        time2 = System.nanoTime();
        System.out.println(time2-time);
        System.out.println(i);
         i=0;
        time = System.nanoTime();
        while(matcher2.find()){
            i++;
        }
        time2 = System.nanoTime();
        System.out.println(time2-time);
        System.out.println(i);
         i = 0;
        time = System.nanoTime();
        while(matcher3.find()){
            i++;
        }
        time2 = System.nanoTime();
        System.out.println(time2-time);
        System.out.println(i);

    }

    private static String WORDS = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris venenatis, purus et iaculis convallis, tellus nisi facilisis tellus, ut bibendum metus purus vel lorem. Curabitur justo sem, placerat quis mi eu, iaculis fermentum est. Nam sit amet feugiat massa. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam turpis est, porta sed vehicula at, scelerisque sit amet libero. Vivamus lacinia auctor neque aliquet iaculis. Sed a porta ipsum, id hendrerit lectus. Suspendisse quis justo vitae tortor auctor suscipit. In eget fringilla leo. Donec aliquam risus at laoreet suscipit. Nam dictum tincidunt risus, nec aliquam ante luctus non. Donec nec rhoncus eros. Duis sodales nisl et dolor sagittis ultricies.\n" +
            "\n" +
            "Aenean elementum dapibus mauris, sed suscipit lacus consectetur eu. Etiam aliquet tortor quis eros malesuada maximus. Nunc libero tortor, pulvinar sit amet mauris quis, sodales accumsan purus. Pellentesque lacinia tempor mauris, a efficitur ligula volutpat dignissim. Quisque ultrices magna sapien, nec posuere elit dapibus id. Maecenas maximus, mauris nec venenatis dictum, tellus mi imperdiet massa, quis eleifend massa tortor ac nisl. Etiam faucibus rutrum dui a tempor. Proin non massa porta, commodo mi at, interdum elit. Donec ut ante ac nulla commodo feugiat non quis nunc. Fusce aliquam sed nulla non commodo. Duis vel accumsan lorem.\n" +
            "\n" +
            "Sed dolor dolor, rhoncus quis orci id, lacinia fringilla est. Aliquam quis nulla pellentesque, condimentum risus at, finibus augue. Donec congue sollicitudin justo non tempus. In tincidunt ante eu lacus vehicula, nec blandit tortor pellentesque. Aliquam iaculis neque neque, sed luctus tortor rhoncus id. Aliquam sollicitudin tristique neque ut faucibus. Duis ut volutpat arcu. Sed posuere ac ante sit amet ultrices. Suspendisse a nulla id libero gravida lobortis. Proin vulputate aliquam ex a consectetur. Cras fringilla placerat urna ut euismod. Curabitur vulputate enim vitae purus volutpat, vitae placerat justo laoreet. Vestibulum fermentum tellus dui, sit amet pharetra arcu pulvinar id. Integer luctus mi eleifend, placerat erat eget, pretium lorem.\n" +
            "\n" +
            "Morbi vestibulum dui quis dapibus volutpat. Maecenas consectetur aliquet erat. Suspendisse vel rhoncus nulla, non efficitur nisi. Donec finibus risus vitae mauris ornare, id sagittis ipsum consequat. Nam vitae sem malesuada, vulputate arcu vitae, finibus enim. Proin ut mattis lectus, eget commodo magna. Ut non posuere neque. Sed suscipit urna sed maximus commodo. Nullam placerat lacus pellentesque ligula iaculis, sit amet iaculis sapien mattis. Vivamus magna mauris, varius eget tempor ut, consectetur quis ligula.\n" +
            "\n" +
            "Nam malesuada nec mauris in dapibus. In eu sollicitudin quam. Donec rutrum tortor vel felis rhoncus hendrerit. Nulla facilisi. Cras magna ex, dignissim ut nisi in, laoreet lobortis ante. Nullam in nisi nec urna maximus euismod ut vel ex. Nam vestibulum auctor sollicitudin. Ut ornare blandit leo, at laoreet ante commodo sed. Vestibulum vulputate nisl dui. In faucibus ante quis urna condimentum laoreet. Etiam congue auctor nibh, at varius orci. Suspendisse et ipsum porta, lacinia augue vel, facilisis quam.";
}
