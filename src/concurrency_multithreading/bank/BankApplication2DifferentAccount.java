package concurrency_multithreading.bank;

public class BankApplication2DifferentAccount {
    public static void main(String[] args) {
        RBIBank johnAccount = new RBIBank(7000.00);
        RBIBank karthikAccount = new RBIBank(10000.00);

        // Create threads for different accounts
        ATM atmThread = new ATM(johnAccount);
        GooglePay googlePayThread = new GooglePay(karthikAccount);

        atmThread.setName("ATM");
        googlePayThread.setName("Google Pay");

        // Start the threads
        atmThread.start();
        googlePayThread.start();

        // Wait for both threads to complete
        try {
            atmThread.join();
            googlePayThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
