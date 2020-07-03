package zaj08_03.interfejsy2;

public abstract class CarWithClima extends Car implements ICarWithClima {



    @Override
    public boolean canIOpenWindow(){
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

}
