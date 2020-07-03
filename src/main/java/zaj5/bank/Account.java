package zaj5.bank;

/**
 * Created by pwykowski
 */
public class Account {

    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    void transfer(float money, Account account) {
        if (money > this.balance) {
            System.out.println("Za mało hajsów");
        } else {
            this.balance -= money;
            account.balance += money;
        }
    }

}
