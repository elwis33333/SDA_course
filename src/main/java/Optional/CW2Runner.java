package Optional;

public class CW2Runner {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[2];
        Thread[] threads = new Thread[2];
        Integer[] list = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 2; i++) {
            runnables[i] = new CW2(i, list);
            threads[i] = new Thread(runnables[i]);

        }
        for (int i = 0; i < 2; i++) {
            threads[i].start();

        }

    }
}
