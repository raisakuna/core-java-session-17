package concurrency_multithreading.bank;

public class ATM extends Thread{
    RBIBank accntObject;
    ATM(RBIBank accntObject){
        this.accntObject=accntObject;
    }

    @Override
    public void run(){
        accntObject.withdraw(3000.0);
    }
}
