package zaj08_03.Kolekcje;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Poland","Warsaw");
        treeMap.put("Germany","Berlin");

//        printAll(treeMap);

    }

    public static void printAll(Map<String,String> treeMap){
        for(Map.Entry<String, String> et: treeMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }
        System.out.println();
    }
}
