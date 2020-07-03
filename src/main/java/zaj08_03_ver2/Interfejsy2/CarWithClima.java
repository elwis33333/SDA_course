package zaj08_03_ver2.Interfejsy2;

public abstract class CarWithClima extends Car implements ICarWithClima{

    @Override
    public boolean canIOpenWindow(){
        return false;
    }

    @Override
    public void startEngine(){
        System.out.println("Engine is started");
    }

    @Override
    public void stopEngine(){
        System.out.println("Engine is stopped");
    }

}
