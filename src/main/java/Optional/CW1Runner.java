package Optional;

public class CW1Runner {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[3];
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            runnables[i] = new CW1(i, 1000*(i+1));
            threads[i] = new Thread(runnables[i]);

        }
        for (int i = 0; i < 3; i++) {
           threads[i].start();

        }

    }
}
