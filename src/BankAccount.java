import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.Scanner;

public class BankAccount {
    Scanner in = new Scanner(System.in);
//    private long accountNumber;
//    private String accountHolder;
//    private double balance;
//
//    public BankAccount(long accountNumber, String accountHolder) {
//        this.accountNumber = accountNumber;
//        this.accountHolder = accountHolder;
//    }

    public void ExistingCustomer(long existCustAcNumber , String accountHolder){
        NewCustomer newCustomer = new NewCustomer();
        String oldCustName = newCustomer.getAccountHolderName();
        long oldAcNumber = newCustomer.getNewAccountNumber();
        if(existCustAcNumber==oldAcNumber && accountHolder.equals(oldCustName)){
            System.out.println("details matched !");
        }else {
            System.out.println("user does not exist !");
        }
    }
}
    class NewCustomer {
        private static String accountHolderName;
        private static long newAccountNumber;
        private static double updatedBalance;

        public void NewAccount(String newCustName) throws InterruptedException {
            System.out.println("Congratulations your account successfully created !");
            Thread.sleep(700);

            accountHolderName = newCustName;
            newAccountNumber = 356836; // Assuming a method to generate account number
            double balance = 0.0;
            BankOperations bankOperations = new BankOperations(balance);
            updatedBalance = bankOperations.setOldBalance(balance);
            System.out.println("your Account details are as follows :");
            Thread.sleep(300);
            System.out.println("Account holder name =>"+ newCustName);
            System.out.println("Account number => "+ newAccountNumber);
            System.out.println("Account balance => "+ balance);
            bankOperations.greeting();
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public long getNewAccountNumber() {
            return newAccountNumber;
        }

        public double getBalance() {
            return updatedBalance;
        }
    }









