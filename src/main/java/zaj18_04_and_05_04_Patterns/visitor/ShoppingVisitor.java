package zaj18_04_and_05_04_Patterns.visitor;

public class ShoppingVisitor implements MyVisitor {
    private float tax = 1.23f;

    public float visit(Book book){ return book.getPrice() * book.getTax();}
    public float visit(DiscDVD discDVD){ return discDVD.getPrice() * discDVD.getTax();}
    public float visit(Perfume perfume){ return perfume.getPrice() * perfume.getTax();}
}
