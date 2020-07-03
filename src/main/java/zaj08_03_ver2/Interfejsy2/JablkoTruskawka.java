package zaj08_03_ver2.Interfejsy2;

//tutaj robimy model samochodu marki Jablko model Truskawka
public class JablkoTruskawka extends CarWithClima{

    public JablkoTruskawka() {
        this.color="red";
        this.name="strawberry";
        this.enginePower=90.0;
        this.engineDisplacement=1400.0;
    }

    @Override
    public void increaseTemperature(){
        System.out.println("Temperature in JablkoTruskawka increased");
    }

    @Override
    public void decreaseTemperature(){
        System.out.println("Temperature in JablkoTruskawka decreased");
    }

    @Override
    public void go(){
        this.startEngine();
        System.out.println("I'm going [JablkoTruskawka]");
        this.stopEngine();
    }

    public void whoAreYou(){
        System.out.println("I'm JablkoTruskawka, I drive slowly");
    }

}
