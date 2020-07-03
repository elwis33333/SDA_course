package zaj08_03.interfejsy2;

public class CarTest {
    public static void main(String[] args) {
        SportCar sportCar = new Ferrari();
        sportCar.go();
        sportCar.increaseTemperature();
        sportCar.decreaseTemperature();
        sportCar.whoAreYou();
        sportCar.openRoof();
        sportCar.closeRoof();
    }
}
