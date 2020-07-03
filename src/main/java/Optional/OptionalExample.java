package Optional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {


        List<Integer> listInteger = new LinkedList<>();
        listInteger.add(2);
        //listInteger.add(3);
        listInteger.add(4);
        System.out.println(3*findOddOptional(listInteger).orElse(0));

        System.out.println(5*findOdd(listInteger));

    }
    //jak to robilismy bez optionala
    private static Integer findOdd(List<Integer> integerList){
        for (Integer a : integerList) {
            if(a%2==1){
                return a;
            }

        }
return null;
    }
    //jak sie robi to lepiej
    private static Optional<Integer> findOddOptional(List<Integer> integerList){
        Optional<Integer> opt = Optional.empty();//tworzenie pustego optionala
        for (Integer a : integerList) {//w petli szukamy pierwszej liczby nieparzystej
            if(a%2==1){
                opt=Optional.ofNullable(a);//opakowywujemy znaleziona liczbe w optionala
                return opt;//zwroci optionala
            }

        }
        return opt;//zwroci optionala pustego gdy nie znajdze liczby parzystej na liscie
    }
}
