package zaj18_04_Patterns.visitor;

public interface Element {
    float accept(MyVisitor visitor);
}
