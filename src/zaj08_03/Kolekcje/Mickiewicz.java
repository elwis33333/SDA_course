package zaj08_03.Kolekcje;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Mickiewicz {

    List<String> wordsList = new ArrayList<>();
    String text;
    String[] words;
    Map<String, Integer> wordsMap = new HashMap<>();
    Map<String, Integer> sortedWordsMap  = new HashMap<>();
    int cnt;
    static BufferedReader inputFile;
    String line;

    public static void main(String[] args) throws IOException {
        Mickiewicz mickiewicz = new Mickiewicz();
        mickiewicz.analysis();

    }

    public void analysis() throws IOException {
        String filepath = "C:\\Users\\Karol\\IdeaProjects\\Kolekcje\\src\\main\\java\\Set\\tadeusz.txt";
        try {
            //utworzenie nowego bufferedReader z nowego FileReader
            inputFile = new BufferedReader(new FileReader(filepath));
            while (true) {
                line = inputFile.readLine();
                if (line == null) {
                    break;
                }

                text += " ";
                text += line;
            }
        }finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }
        text=text.toLowerCase();
        words=text.split("[,-;!.\\s^<*–…»/:—()?>(+'«]");
        for (String word :words) {
            if(wordsMap.containsKey(word)){
                wordsMap.put(word,wordsMap.get(word)+1);
            }else{
                wordsMap.put(word,+1);
            }

        }
        wordsMap.remove("");


        sortedWordsMap = sortByValue(wordsMap);
        for(Map.Entry<String,Integer> et : sortedWordsMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }

    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet()); //tworzymy liste wpisow mapy
        list.sort(Map.Entry.comparingByValue()); //sortujemy po wartosci
        Map<K, V> result = new LinkedHashMap<>(); //tworzymy nowa mape gdzie przechowujemy wynik
        for (Map.Entry<K, V> entry : list) { //iterujemy po elemtach listy ktore sa wpisami
            result.put(entry.getKey(), entry.getValue()); //dodajemy kolejne juz posortowane wpisy do mapy
        }
        return result;
    }


}
