package concurrency_multithreading.bank;

public class RBIBank {
    private double balance;

    public RBIBank(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            this.balance -= withdrawAmount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + withdrawAmount + ". New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + withdrawAmount + ", but insufficient funds.");
        }
    }

    public synchronized void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println(Thread.currentThread().getName() + " deposited " + depositAmount + ". New balance: " + balance);
    }
}
