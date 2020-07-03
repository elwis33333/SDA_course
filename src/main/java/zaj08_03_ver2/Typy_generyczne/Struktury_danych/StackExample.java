package zaj08_03_ver2.Typy_generyczne.Struktury_danych;

public class StackExample {
    int[] tab; //za pomoca tablicy realizujemy stos
    int pos; //wskaznik gdzie bedziemy wstawiac nowy element
    //jednoczesnie jest to aktualna wielksosc stosu

    public StackExample(int max){
        tab = new int[max]; //inicjalizujemy stos konkretna wielkoscia
        pos=0; //zaczynamy od pustego stosu
    }

    public void add(int a) throws IndexOutOfBoundsException{
        if(pos<tab.length){ //sprawdzam czy nie wykraczam poza rozmiar tablicy
            tab[pos]=a; //przypisuje nowy element do tablicy
            pos++;  //zwiekszam indeks ktorym wskazuje aktualny element
        }
        else{
            //rzucam wyjatkiem
            throw new IndexOutOfBoundsException("Przepełnienie");
        }
    }

    public int get() throws IndexOutOfBoundsException{
        if(pos<=0){
            throw new IndexOutOfBoundsException("Pusty stos");
        }
        else{
            int tmp = tab[pos-1]; //przypisuje do tymczasowej zmiennej
            tab[pos-1] = 0; //zeruje pobrany element z tablicy
            pos--; //zmniejszam indeks o 1
            return tmp; //zwracam wartosc pobrana
        }
    }

    public int size(){
        return pos;
    }

    public boolean isEmpty(){
        return pos==0;
    }

    public void clear(){
        while(!isEmpty()){ //dopoki stos nie jest pusty
            get();  //pobieraj element
        }
    }


}
