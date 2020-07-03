package zaj08_03.Kolekcje;

public class Stos {

    public static void main(String[] args) {
        Stos stos = new Stos(5);
        stos.add(1);
        stos.add(2);
        stos.add(3);
        stos.add(4);
        System.out.println(stos.get());
        System.out.println(stos.get());
        System.out.println(stos.get());
        System.out.println(stos.get());
    }

    int[] tab;
    int pos;

    public Stos(int max) {
        tab = new int[max];
        pos = 0;
    }

    public int get() throws IndexOutOfBoundsException{
        if(pos<=0){
            throw new IndexOutOfBoundsException("Pusty stos");
        }else{
            int tmp = tab[pos-1];
            tab[pos]=0;
            pos--;
            return tmp;
        }
    }


    public int size(){
        return pos;
    }

    public boolean isEmpty(){
        return pos==0;
    }

    public void clear(){
        while(!isEmpty()){
            get();
        }
    }

    public void add(int a) throws IndexOutOfBoundsException {
        if(pos<tab.length){ // sprawdzam czy nie wykraczam poza rozmiar talicy
            tab[pos]=a;
            pos++;
        }
        else{
            throw new IndexOutOfBoundsException("Przepełnienie");
        }
    }

}
