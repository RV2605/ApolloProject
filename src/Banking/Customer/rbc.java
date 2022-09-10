package Banking.Customer;

public class rbc extends BankAccount{

    public static void main(String[] args) {
        rbc bc = new rbc();
        System.out.println("in rbc");
        bc.amountDeposit(555);
    }
}
