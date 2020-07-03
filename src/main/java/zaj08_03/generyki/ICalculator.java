package zaj08_03.generyki;

public interface ICalculator{
    public abstract <T extends Number> double add(T num1, T num2);
    public abstract <T extends Number> double substract(T num1, T num2);
    public abstract <T extends Number> double divide(T num1, T num2);
    public abstract <T extends Number> double multiply(T num1, T num2);

}
