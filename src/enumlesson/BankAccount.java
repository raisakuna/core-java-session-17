package enumlesson;

public class BankAccount {

    private String accountNumber;
    private String accountHolderNumber;
    private  String bankName;
    private String customerId;
    private int routingNumber;
    private String accountOptionDate;
    private String accountType;
    private boolean hasDebitCard;
    private boolean hasCreditCard;
    private boolean isLocked;
    private double accountBalance;
    private String ssn;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderNumber() {
        return accountHolderNumber;
    }

    public void setAccountHolderNumber(String accountHolderNumber) {
        this.accountHolderNumber = accountHolderNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountOptionDate() {
        return accountOptionDate;
    }

    public void setAccountOptionDate(String accountOptionDate) {
        this.accountOptionDate = accountOptionDate;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isHasDebitCard() {
        return hasDebitCard;
    }

    public void setHasDebitCard(boolean hasDebitCard) {
        this.hasDebitCard = hasDebitCard;
    }

    public boolean isHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(boolean hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    private void setSsn(String ssn){
        this.ssn=ssn;
    }

    public void withDraw(double withDrawAmount){
        this.accountBalance = accountBalance -withDrawAmount;
    }

    public void transfer(double transferAmount){
        this.accountBalance =  accountBalance-transferAmount;
    }

    public void deposit(double depositAmount){
        this.accountBalance = this.accountBalance + depositAmount;
    }
}
