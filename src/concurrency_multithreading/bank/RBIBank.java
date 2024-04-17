package concurrency_multithreading.bank;

public class RBIBank {
    private double balance;
    public RBIBank(double balance){
        this.balance = balance;
    }

    public synchronized void withdraw(double withdrawAmount){
        this.balance = balance-withdrawAmount;
    }

    public synchronized void deposit(double depositAmount){
        this.balance = balance+depositAmount;
    }
}
