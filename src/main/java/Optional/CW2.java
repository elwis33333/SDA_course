package Optional;

public class CW2 implements Runnable {
   Integer[] list;
private int id;
    public CW2(int id, Integer[] list) {
        this.list = list;
        this.id=id;
    }

    @Override
    public void run() {
        for (int i = 0; i < list.length; i++) {
            list[i]= list[i]+100; //pokazuje wyścig < czasami zwiększa o 200 zamiast o 100
            System.out.println("Wątek: " + id + " -> "+ list[i]);
        }
    }
}
