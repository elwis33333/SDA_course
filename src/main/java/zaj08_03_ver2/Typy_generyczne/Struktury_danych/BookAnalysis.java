package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BookAnalysis {
    String text;
    String[] words;
    List<String> wordsList = new LinkedList<>();
    Map<String, Integer> wordsMap = new HashMap<>();
    Map<String, Integer> sortedWordsMap = new HashMap<>();
    int cnt;

    BufferedReader inputFile;
    String line;

    public void analysis() throws IOException {
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Java - zaawansowana\\pan-tadeusz.txt";
        try {
            //utworzenie nowego BufferedReader z nowego FileReader na podstawie sciezki
            inputFile = new BufferedReader(new FileReader(filePath));

            while (true) {
                line = inputFile.readLine(); //wczytuje kolejna linie

                if (line == null) { //jezeli linia jest pusta
                    break; //wyjdz z petli while
                }

                text += " ";
                text += line;
            }
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }

        //zamieniamy wsyzstko na male litery;
        text=text.toLowerCase();

        //odpowiednio rozdzielam tekst na slowa
        //otrzymuje tym samym tablice Stringow
        words = text.split("[,—». «;:()!>?'<-]");

        //w tej petli bede tworzyl mape slow z liczba ich wystapien
        for(String w : words){ //iterujemy po wszystkich slowach
            if(wordsMap.containsKey(w)){ //sprawdzamy czy mapa zawiera dane slowo
                wordsMap.put(w, wordsMap.get(w)+1); //zwiekszmay liczbe wystapien o 1
            }
            else{
                wordsMap.put(w, 1); //wstawiamy nowe slowo z wartoscia 1
            }
        }

        wordsMap.remove("");

        //wyswietlenie zawartosci mapy
        //iterujemy po kolejnych wpisach mapy (Map.Entry<>)
        for(Map.Entry<String, Integer> et: wordsMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }

        sortedWordsMap = sortByValue(wordsMap);
        //wyswietlenie zawartosci mapy
        //iterujemy po kolejnych wpisach mapy (Map.Entry<>)
        for(Map.Entry<String, Integer> et: sortedWordsMap.entrySet()){
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


