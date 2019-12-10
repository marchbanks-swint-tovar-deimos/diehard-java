package laurenWeek1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(600.23);
        Account account2 = new Account(0.00);

        //==========================account1================//
        //set up the scanner for transactions/deposits made to the account
        Scanner scanner = new Scanner(System.in);
        double depositAmount;
        double withdrawalAmount;
        System.out.println("Account1 balance: "+ "$" + account1.getBalance());
        System.out.println("Please enter a deposit amount for account1: ");

        depositAmount = scanner.nextDouble();
        System.out.println("Adding " + "$" + depositAmount + " to account1 balance.");
        //actually will add the users input to the account1 balance
        account1.credit(depositAmount);
        System.out.println("Account1 new balance is: " +"$" + account1.getBalance());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //==========================account2================//
        System.out.println("Account2 balance: "+ "$" + account2.getBalance());
        System.out.println("Please enter a deposit amount for account2: ");

        depositAmount = scanner.nextDouble();
        System.out.println("Adding" + depositAmount + " to account2 balance.");
        //actually will add the users input to the account1 balance
        account2.credit(depositAmount);
        System.out.println("Account2 new balance is: " +"$" + account2.getBalance());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //===========withdraw from the account1============
        System.out.println("Account1 balance: "+ "$" + account1.getBalance());
        System.out.println("Please enter a withdrawal amount for account1: ");

        withdrawalAmount = scanner.nextDouble();
        System.out.println("Subtracting " + withdrawalAmount + " from account1 balance");

        if (account1.getBalance() >= withdrawalAmount){
            account1.debitCard(withdrawalAmount);
            System.out.println("Account1 new balance is: "+ "$" + account1.getBalance());
        }
        else {
            System.out.println("****Debit amount exceeded account balance****");
        }

    }
}
