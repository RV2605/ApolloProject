package Banking;
import Banking.Customer.BankAccount;

import java.util.Scanner;

public class BankInterface {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Vinoth",557798,550);
        System.out.println(ba);
        System.out.println("Please enter the operation you want to perform");
        System.out.println("withdrawal --------OR--------- deposit");
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        int amt;
        if (operation.toLowerCase().equals("withdrawal")){
            ba.amountWithdrawal();
            System.out.println("your Balance is " + ba.getBalance());
        }
        else if (operation.toLowerCase().equals("deposit")) {
            System.out.println("Enter the amount you want to deposit");
            amt= sc.nextInt();
            ba.amountDeposit(amt);

        }
        else {
            System.out.println("Enter the proper operation");
        }

    }

}
