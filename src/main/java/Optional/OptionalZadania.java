package Optional;

import java.util.*;

public class OptionalZadania {

    public static void main(String[] args) {
        List<Integer> listInteger = new LinkedList<>();
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        System.out.println(findIntegerInList(1, listInteger).orElse(0));
        sprawdzCzyNieJestNullem1(2, listInteger);
        Map<Integer,String> listIntegerMap = new TreeMap<>();
        listIntegerMap.put(1,"Jeden");
        listIntegerMap.put(2,"Dwa");
        listIntegerMap.put(3,"Trzzy");
        listIntegerMap.put(4,"Cztery");
        listIntegerMap.put(5,"Piec");
       // System.out.println(findIntegerInMap(2,listIntegerMap).orElse("nie ma i uj"));
        System.out.println(findIntegerInMap(2,listIntegerMap).orElse("Nie ma takiego rejestru z tym kluczem"));
        sprawdzCzyNieJestNullem2(2, listIntegerMap);
    }
    private static Optional<Integer> findIntegerInList(Integer x, List<Integer> integerList){
        Optional<Integer> opt = Optional.empty();
        for (Integer a : integerList) {
            if(a==x){
                 opt = Optional.ofNullable(a);
                return opt;
            }
        }
    return opt;
    }
    private static Optional<String> findIntegerInMap(Integer x, Map<Integer,String> integerMap){
        Optional<String> opt = Optional.empty();
        for (Map.Entry<Integer,String> a : integerMap.entrySet()) {
            if(a.getKey()==x) {
                opt = Optional.ofNullable(a.getValue());
                return opt;
            }
        }
        return opt;
    }
    private static void sprawdzCzyNieJestNullem1(Integer x, List<Integer> integerList){
Optional<Integer> aa = findIntegerInList(x, integerList);
        if(aa.isEmpty()){
            System.out.println("W liście nie ma takiego Integera");
        }
        else {
            System.out.println(aa.get());
        }
    }
    private static void sprawdzCzyNieJestNullem2(Integer x, Map<Integer,String> integerMap){
        Optional<String> aa = findIntegerInMap(x, integerMap);
        if(aa.isEmpty()){
            System.out.println("Nie ma rekordu o takim kluczu");
        }
        else {
            System.out.println(aa.get());
        }
    }
}
