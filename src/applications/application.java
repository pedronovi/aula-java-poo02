package applications;

import entities.bankAccount;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountOwner = sc.nextLine();


        // Estrutura IF para determinar se vai haver um deposito inicial
        System.out.print("Is there an initial deposit (y/n)? ");
        char yn = sc.next().charAt(0);
        bankAccount bankAccount;
        if (yn == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new bankAccount(accountNum, accountOwner, initialDeposit);
        } else {
            bankAccount = new bankAccount(accountNum, accountOwner);
        }

        System.out.println("Account data:");
        System.out.println(bankAccount);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.depositValue(deposit);

        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdrawValue(withdraw);

        System.out.println("Updated account data:");
        System.out.println(bankAccount);




        sc.close();
    }
}
