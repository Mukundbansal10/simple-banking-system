import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Reserve Bank of india !");
        Thread.sleep(1500);
        System.out.println("are u a existing customer PRESS 1 !!");
        System.out.println("or a New Customer PRESS 2 !");
        Thread.sleep(1000);
        System.out.print("press 1 or 2 to proceed further => ");
        int customerExistence = in.nextInt();
        if (customerExistence == 1 || customerExistence == 2) {
            switch (customerExistence){
                case 1:
                    System.out.println("Enter your bank  details !");
                    System.out.print("Enter your Account number => ");
                    long existCustAcNumber = in.nextLong();
                    System.out.print("Enter account holder name => ");
                    String accountHolderName = in.next();
                    System.out.println(" ");
                    BankAccount bankAccount = new BankAccount();
                    bankAccount.ExistingCustomer(existCustAcNumber,accountHolderName);
                    break;
                case 2:
                    System.out.println("Create your Account !");
                    Thread.sleep(500);
                    System.out.print("Enter your Name => ");
                    String newCustomerName = in.next();
                    System.out.println(" ");

                    NewCustomer newCustomer = new NewCustomer();
                    newCustomer.NewAccount(newCustomerName);
                    BankOperations bankOperations = new BankOperations(newCustomer.getBalance());
                    bankOperations.greeting();
                    break;
            }
        }else {
            System.out.println("Process Terminated due to wrong Selection");
        }
    }
}
