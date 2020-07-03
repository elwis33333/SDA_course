package zaj2;

public class Calculatorr {
    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    private int aa = 4;
    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculatorr calculator = new Calculatorr();
        int sum = calculator.add(2,3);
        System.out.println(sum);
    }
}
