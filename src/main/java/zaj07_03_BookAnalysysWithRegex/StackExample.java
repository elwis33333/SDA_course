package zaj07_03_BookAnalysysWithRegex;

public class StackExample {
    int[] tab;//za pomoca tablicy realizujemy stos
    int pos;//wskaznik gdzie bedziemy wstawiac nowy element - jednoczesnie jest to aktualna wielkosc stosu


    public StackExample(int max) {
        tab = new int [max]; //inicjalizujemy stos z konkretną wielkoscią
        pos=0;
    }
    public void add(int a)throws IndexOutOfBoundsException{
        if(pos<tab.length){ //sprawdzam czy nie przekraczam poza rozmiar tablicy
            tab[pos]=a; //przypisuję nowy element do tablicy
            pos++; //zwiększ indeks który wskazuje aktualny element
        }
        else {throw new IndexOutOfBoundsException("Przepełnienie");} // rzucam wyjątkiem
    }
    public int get() throws IndexOutOfBoundsException{
        if(pos<=0){
            throw new IndexOutOfBoundsException("Pusty stos");
        }
        else{
            int tmp = tab[pos-1]; // tymczasowa zmienna
            tab[pos-1]=0; //zeruję wartość z tablicy
            pos--; // zmniejszam pozycję
            return tmp; //zwracam wartosc zabraną ze stosu
        }
    }
    public int size(){
        return pos;
    }
    public boolean isEmpty(){
        return pos==0;
    }
    public void clear(){
        while (!isEmpty()){ //dopuki stos nie jest pusty
            get(); // pobieraj element
        }
    }
}
