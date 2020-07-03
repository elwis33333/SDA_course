package Optional;

public class MyRun implements Runnable {
    private int id;
   public int num = 0;
    public MyRun(int id){
        this.id = id;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Watek"+ id+" "+num);
            num++;
            try{
                //usypiamy watek na 100 ms
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
