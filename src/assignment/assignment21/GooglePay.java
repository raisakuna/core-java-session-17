package assignment.assignment21;

public class GooglePay extends Thread{
    RBIBank accntObject;
    GooglePay(RBIBank accntObject){
        this.accntObject=accntObject;
    }

    @Override
    public void run(){
        accntObject.deposit(12000.00);
    }
}
