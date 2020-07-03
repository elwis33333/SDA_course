package zaj08_03.interfejsy2;

public abstract class SportCar extends Car implements ISportCar  {
    @Override
    public void useTurbo() {
        System.out.println("Wrumm wrumm");
    }


    @Override
    public void increaseTemperature() {
        System.out.println("Temperature is increased");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("Temperature is decreased");
    }


    @Override
    public void go() {
        this.startEngine();
        System.out.println("WRUUUUUUM BRUUUMMMM EEEEEEEEEEE");
        this.stopEngine();
    }

    public void whoAreYou(){
        System.out.println("I am Hondzia");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }


    @Override
    public void openRoof() {
        System.out.println("Skryyyyyyt");
    }

    @Override
    public void closeRoof() {
        System.out.println("Szzzzzzz");
    }
}
