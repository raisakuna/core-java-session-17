package concurrency_multithreading.bank;

public class BankApplication {
    public static void main(String[] args) {
        RBIBank johnAccount = new RBIBank(7000.00);

        ATM ATMThread = new ATM(johnAccount);
        GooglePay googlePayThread = new GooglePay(johnAccount);

        ATMThread.setName("ATM");
        googlePayThread.setName("Google Pay");

        ATMThread.start();
        googlePayThread.start();


    }
}
