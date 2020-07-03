package zaj16_02.kg.object;

public class Calculator {

    public int add(int a, int b){
        System.out.println("int");
        return a+b;
    }

    public float add(float a, float b){
        System.out.println("float");
        return a+b;
    }

    public double add(double a, double b){
        System.out.println("double");
        return a+b;
    }

    public int add(int... b){
       int result=0;
        System.out.println("double");
        for (int i = 0; i < b.length; i++) {
            result+=b[i];
        }
        return result;
    }


    public String add(String a, String b){
        System.out.println("String");
        return a+b;
    }


}
