package zaj07_03_BookAnalysysWithRegex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BookAnalysis {
    String text;
    String[] words;
    List<String> wordsList=new LinkedList<>();
    Map<String, Integer> wordsMap = new HashMap<>();
    Map<String, Integer> sortedWordsMap = new HashMap<>();;
    BufferedReader inputFile;
    String line;

    public void analysis() throws IOException {
        String filePath = "C:\\Users\\admin\\IdeaProjects\\zaj07_03\\src\\main\\java\\tadeusz.txt";
        try {
            //utworzenie nowego bufferreader z nowegofilereader na podstawie sciezki
            inputFile = new BufferedReader(new FileReader(filePath));
            while (true) {
                line = inputFile.readLine();
                if (line == null) break; //jak linnia jest pusta wyjdź z pętli while
                text += "";
                text += line;
            }
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }
        text=text.toLowerCase();
        words=text.split("[,-;!.\\s^<*–…»/:—()?>(+'«]"); //odpowiednie rozdzielam tekst na słowa, otrzymuję tablicę Stringów
        //w tej petli bede tworzyl mapę slow z liczba ich wystapien
        for (String w: words) {
            if(wordsMap.containsKey(w)){
                wordsMap.put(w, wordsMap.get(w)+1); //zwiekszamy wartosc tego slowa
            }
            else{
                wordsMap.put(w,1); //wstawiamy nowe slowo z wartoscia 1
            }
        }
        wordsMap.remove("");
        sortedWordsMap = sortByValue(wordsMap);
        //wyswietlenie zawartosci mapy
        for (Map.Entry<String,Integer> et: sortedWordsMap.entrySet()){
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
