package zaj08_03.Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadania {
    public static void main(String[] args) {

        Integer[] nums = {2,4,1,6,3,7,9};
        List<Integer> lista = new ArrayList<>(Arrays.asList(nums));
        lista.add(1);
        lista.add(2);
        System.out.println(avg(lista));

    }
    public static double avg(List<Integer> list){
        int sum=0;
        for(Integer num : list){
            sum+=num;
        }
        return (double)sum/list.size();
    }
}
