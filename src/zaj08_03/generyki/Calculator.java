package zaj08_03.generyki;



public class Calculator implements ICalculator{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int i =1;
        int i2 =2 ;
        System.out.println(calculator.add(i, i2));
        System.out.println(calculator.substract(i, i2));
        System.out.println(calculator.divide(i, i2));
        System.out.println(calculator.multiply(i, i2));
    }


    @Override
    public <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue()+num2.doubleValue();
    }

    @Override
    public <T extends Number> double substract(T num1, T num2) {
        return num1.doubleValue()-num2.doubleValue();
    }

    @Override
    public <T extends Number> double divide(T num1, T num2) {
        return num1.doubleValue()/num2.doubleValue();
    }

    @Override
    public <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue()*num2.doubleValue();
    }
}
