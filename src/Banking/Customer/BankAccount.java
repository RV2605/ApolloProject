package Banking.Customer;

public class BankAccount {
    private String userName;
    private int accountNumber;
    private int amount;
    private double balance = 5000.00;

    public BankAccount() {
        System.out.println("in Bank account");
    }

    public BankAccount(String userName, int accountNumber, int amount) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.amount = amount;

    }

    @Override
    public String toString() {
        return "Welcome to Internet Banking "+ '\''+
                "BankAccount{" +
                "userName='" + userName + '\'' +
                ", accountNumber=" + accountNumber +
                ", Balance=" + balance +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void amountWithdrawal(){
       if (balance > amount){
           System.out.println("Please collect the cash");
           balance = balance - amount;
       }
       else {
           System.out.println("Insufficient Funds");
       }
    }
    public void amountDeposit(int amount){
        balance =balance+ amount;
        System.out.println("your Updated balance is " + balance);
    }
}
