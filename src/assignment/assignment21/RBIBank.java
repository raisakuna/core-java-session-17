package assignment.assignment21;

public class RBIBank {
    private double balance;
    public RBIBank(double balance){
        this.balance = balance;
    }

    public  void withdraw(double withdrawAmount) {
        synchronized (this) {

            this.balance = balance - withdrawAmount;
        }
    }
    public synchronized void deposit(double depositAmount) {
        synchronized (this) {
            this.balance = balance + depositAmount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
