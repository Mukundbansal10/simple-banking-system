import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to Reserve Bank of india !");
            Thread.sleep(1500);
            System.out.println("are u a existing customer PRESS 1 !!");
            System.out.println("or a New Customer PRESS 2 !");
            System.out.println("for exit PRESS 3 !");
            Thread.sleep(1000);
            System.out.print("press 1,2 or 3 to proceed further => ");
            int customerExistence = in.nextInt();
            if (customerExistence == 1 || customerExistence == 2 || customerExistence==3) {
                switch (customerExistence) {
                    case 1:
                        System.out.println("Enter your bank  details !");
                        System.out.print("Enter your Account number => ");
                        long existCustAcNumber = in.nextLong();
                        System.out.print("Enter account holder name => ");
                        String accountHolderName = in.next();
                        System.out.println(" ");
                        BankAccount bankAccount = new BankAccount();
                        bankAccount.ExistingCustomer(existCustAcNumber, accountHolderName);
                        break;
                    case 2:
                        System.out.println("Create your Account !");
                        Thread.sleep(500);
                        System.out.print("Enter your Name => ");
                        String newCustomerName = in.next();
                        System.out.println(" ");
                        NewCustomer newCustomer = new NewCustomer();
                        newCustomer.NewAccount(newCustomerName);
                        break;
                    case 3:
                        System.out.println("Thank you for joining with us !");
                        System.out.println("Have a nice day !");
                        exit = true;
                        break;
                }
            }
        }
    }
}
