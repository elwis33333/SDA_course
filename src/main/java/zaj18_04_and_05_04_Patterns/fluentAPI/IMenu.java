package zaj18_04_and_05_04_Patterns.fluentAPI;

public interface IMenu{

    public IMenu order(int index);

    public IMenu eat();

    public IMenu pay();

    public IItem get(int index);

}