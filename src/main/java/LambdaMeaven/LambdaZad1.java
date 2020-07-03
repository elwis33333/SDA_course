package LambdaMeaven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class LambdaZad1 {  //zaznaczamy klasę do testowania i klikamy ctr+shift+T żeby utworzyć klasę testowąa w meavanie - Create new test
    //metoda do sortowanie listy z uzyciem klasy anonimowej
    public List<String> sortList(List<String> list){
        //posortowanie listy ignorując wielkość liter
        list.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        return list;//zwrocenie z metody posortowanej listy
    }
//sortowanie z użyciem lambdy
    public List<String> sortListLambda(List<String> list){
        //posortowanie listy ignorując wielkość liter podając lambdę do metody sort
        list.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
        return list;//zwrocenie z metody posortowanej listy
    }
    public String[] sortArray(String[] stringArray){
        //zamiana tablicy na listę
        List<String> list = Arrays.asList(stringArray);
        //sortowanie z użyciem lambdy
        list.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
        //deklaracja nowej tablicy stringów
        String[] result = new String[list.size()];
        //zamiana listy na tablicę i zwrocenie tablicy
        return list.toArray(result);
    }
}