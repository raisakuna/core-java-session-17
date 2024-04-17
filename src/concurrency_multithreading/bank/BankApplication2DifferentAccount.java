package concurrency_multithreading.bank;

public class BankApplication2DifferentAccount {
    public static void main(String[] args) {
        RBIBank johnAccount = new RBIBank(7000.00);
        RBIBank karthikAccount = new RBIBank(10000);

        ATM ATMThread = new ATM(johnAccount);
        GooglePay googlePayThread = new GooglePay(karthikAccount);

        ATMThread.setName("ATM");
        googlePayThread.setName("Google Pay");

        ATMThread.start();
        googlePayThread.start();


    }
}
