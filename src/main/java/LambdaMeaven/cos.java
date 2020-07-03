package LambdaMeaven;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;


public class cos {
    public static void main(String[]args){
//utworzenie nowego wyrazenia lambda
    Consumer<Map<Integer,String> > displayMapLambda = x ->{
        for(Map.Entry<Integer,String> e: x.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
};

    Map<Integer,String>  integerStringMap = new HashMap<>();
    integerStringMap.put(1, "aaa");
    integerStringMap.put(2, "bbb");
    integerStringMap.put(3, "ccc");
    //wypisanie elementow
    displayMapLambda.accept(integerStringMap);
    //bardzo szybkie rozwiazanie z uzyciem metody forEach
    //metoda forEach wykonuje się dla każdego wpisu mapy
    integerStringMap.forEach((key,value)-> System.out.println(key + " : "+value));
}
}