package zaj08_03.Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zad5 {

    public static void main(String[] args) {
        Integer[] nums = {2,4,1,6,3,7,9,12,15};
        Integer[] nums2 = {2,5,1,6,3,7,9,0};
        List<Integer> tree = new ArrayList<>(Arrays.asList(nums));
        List<Integer> tree2 = new ArrayList<>(Arrays.asList(nums2));
        System.out.println(sumLists(tree,tree2));

    }

    public static List<Integer> sumLists(List<Integer> list1 , List<Integer> list2){
        List<Integer> returnList = new ArrayList<>();
        if(list1.size()<list2.size()){
            int i=0;
            for (i = 0; i < list1.size(); i++) {
                returnList.add(list1.get(i)+list2.get(i));
            }
            for (int j=i; j < list2.size(); j++) {
                returnList.add(list2.get(j));
            }
            return returnList;
        }
        int i=0;
        for (i = 0; i < list2.size(); i++) {
            returnList.add(list1.get(i)+list2.get(i));
        }
        for (int j=i; j < list1.size(); j++) {
            returnList.add(list1.get(j));
        }
        return returnList;
    }

}
