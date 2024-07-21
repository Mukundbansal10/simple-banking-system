import java.util.Scanner;

public class BankOperations {
    private double oldBalance;
    private final NewCustomer newCustomer;
    Scanner in = new Scanner(System.in);

    public BankOperations(double oldBalance) {
        this.oldBalance = oldBalance;
        this.newCustomer = new NewCustomer();
    }

    public void greeting() throws InterruptedException {

        boolean exit = false;
        while (!exit) {
            System.out.println(" ");
            System.out.println("What do you want to perform !");
            Thread.sleep(500);
            System.out.println("Deposit money PRESS 1 ! ");
            System.out.println("Withdraw money PRESS 2 !");
            System.out.println("Check balance PRESS 3 !");
            System.out.println("For Exit PRESS 4 !");
            int customerChoice = in.nextInt();
            if (customerChoice == 1 || customerChoice == 2 || customerChoice == 3 || customerChoice == 4) {
                switch (customerChoice) {
                    case 1:
                        depositMoney();
                        break;
                    case 2:
                        withdrawMoney();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for joining with us !");
                        System.out.println("Have a nice day !");
                        exit = true;
                        break;
                    default:
                        System.out.println("Process is being terminated due to wrong selection!");
                        exit = true;
                        break;
                }
            }

        }
    }
    public void depositMoney(){
        System.out.println("How much money you want to deposit !");
        System.out.println("Enter the amount in rupees => ");
        double depositAmount = in.nextDouble();
        NewCustomer newCustomer = new NewCustomer();
         oldBalance = newCustomer.getBalance();
            oldBalance+=depositAmount;
            newCustomer.updateBalance(oldBalance);
        System.out.println("your Current balance is => "+ oldBalance);
    }
    public void withdrawMoney(){
        System.out.println("How much money you want to withdraw !");
        System.out.println("Enter the amount in rupees => ");
        double withdrawnAmount = in.nextDouble();
        NewCustomer newCustomer = new NewCustomer();
        oldBalance = newCustomer.getBalance();
        if (oldBalance>=withdrawnAmount){
            oldBalance-=withdrawnAmount;
            newCustomer.updateBalance(oldBalance);
        }else {
            System.out.println("Enter amount less than your current balance !");
        }
        System.out.println("your current balance is => "+oldBalance);
    }

    public double setOldBalance(double oldBalance) {
        this.oldBalance = oldBalance;
        newCustomer.updateBalance(oldBalance);
        return oldBalance;
    }

    public void checkBalance(){
        System.out.println("your Current balance is => "+oldBalance);
    }

    public static void main(String[] args) throws InterruptedException {
        double balance = 3;
        BankOperations bankOperations = new BankOperations(balance);
        bankOperations.greeting();
    }

}
