package zaj18_04_and_05_04_Patterns.visitor;

public interface MyVisitor {

    float visit(Book book);

    float visit(DiscDVD discDVD);

    float visit(Perfume perfume);
}