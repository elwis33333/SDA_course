package LambdaMeaven;

public class Test1 {
    @FunctionalInterface
    public interface ITest{
        void sayHello(); //metoda abstrakcyjna
        //w interfejsie funkcyjnym moge miec metoda defaultowa
        default void sayGoodbye(){ //metoda domyslna
            System.out.println("GoodbyeInterface");
        }
        //klasa wewnatrz interfejsu
        class MessageClass{
            String message="Message";
            static void printMessage(){
                System.out.println("<Message>");
            }
        }   //tu sie konczy klasa MessageClass
    } //tu sie konczy interfejs ITest
    public static void main(String[] args) {
        //realizacja z uzyciem klasy anonimowej
        ITest test1 = new ITest(){
            @Override
            public void sayHello(){
                System.out.println("Hello");
            }
        };
        //lambda
        ITest test2 = () -> System.out.println("HelloLambda");
        test1.sayHello();
        //uzycie lambdy
        test2.sayHello();
        //wywolanie metody domyslnej
        test2.sayGoodbye();
        ITest.MessageClass messageClass = new ITest.MessageClass();
        messageClass.printMessage();
        ITest.MessageClass.printMessage();
    }
}