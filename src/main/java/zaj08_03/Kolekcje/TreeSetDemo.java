package zaj08_03.Kolekcje;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Integer[] nums = {2,4,1,6,3,7,9};
        SortedSet<Integer> tree = new TreeSet<>(Arrays.asList(nums));

        System.out.println(tree.first());
        System.out.println(tree.last());

        System.out.println(tree.add(1));
        System.out.println(tree.add(11));
        printAll(tree);

        printAll(tree.headSet(9));


    }

    public static void printAll(SortedSet<Integer> tree){
        for(int s: tree){
            System.out.println(s);
        }
        System.out.println();
    }
}
