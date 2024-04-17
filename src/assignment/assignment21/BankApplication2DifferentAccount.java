package assignment.assignment21;

public class BankApplication2DifferentAccount {
    public static void main(String[] args) {
        RBIBank johnAccount = new RBIBank(7000.00);
        RBIBank karthikAccount = new RBIBank(10000);

        ATM atmThread = new ATM(johnAccount);
        GooglePay googlePayThread = new GooglePay(karthikAccount);

        atmThread.setName("ATM");
        googlePayThread.setName("Google Pay");

        atmThread.start();
        googlePayThread.start();

        try {
            atmThread.join(); // Wait for ATM thread to complete
            googlePayThread.join(); // Wait for Google Pay thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output final balances
        System.out.println("John's account balance: " + johnAccount.getBalance());
        System.out.println("Karthik's account balance: " + karthikAccount.getBalance());

    }
}
