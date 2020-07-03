package zaj08_03_ver2.Typy_generyczne;

//tworzony jest interfejs ktory moze byc parametryzowany typem
//dziedziczacym po Number
public interface ICalculator<T extends Number> {
    public abstract T add(T num1, T num2);
    public abstract T subtract(T num1, T num2);
    public abstract T multiply(T num1, T num2);
    public abstract T divide(T num1, T num2);
}
