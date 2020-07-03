package zaj16_02.kg.object;

public class Account {

    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public float getBalance(){
        return this.balance;
    }

    void transfer(float money, Account account){
        if(this.balance>=money){
            this.balance-=money;
            account.balance+=money;
        }else{
            System.out.println("Brak środków");
        }
    }
}
