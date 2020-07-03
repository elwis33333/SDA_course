package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.util.Arrays;
import java.util.List;

public class CW1 {
    public static void main(String[] args) {
//        List<Integer> list= new LinkedList<>();
//
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(7);
//        list.add(9);

        List<Integer> list = Arrays.asList(new Integer[]{1, 3, 5, 7, 9});
        System.out.println(taskList(list));
    }

    public static Double taskList(List<Integer> list){
        Double mean = 0.0;

        for (Integer num : list) {
            mean+=num;
        }

        return mean/list.size();
    }
}
