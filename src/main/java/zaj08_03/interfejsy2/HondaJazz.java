package zaj08_03.interfejsy2;

public class HondaJazz extends CarWithClima {

    public HondaJazz() {
        this.color="Honda";
        this.name="Jazz";
        this.enginePower=83;
        this.engineDisplacement=1400;
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




}
