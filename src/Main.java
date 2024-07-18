import javax.sound.midi.Soundbank;
import java.util.Scanner;
class Bank{

}

public class BankAccount {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Reserve Bank of india !");
        Thread.sleep(1500);
        System.out.println("are u a existing customer PRESS 1 !!");
        System.out.println("or a New Customer PRESS 2 !");
        Thread.sleep(1000);
        System.out.print("press 1 or 2 to proceed further !");
        int customerExistence = in.nextInt();
        if (customerExistence == 1 || customerExistence == 2) {
            switch (customerExistence){
                case 1:
                    System.out.println("okk");
                    break;
                case 2:
                    System.out.println("hii");
                    break;
//                default:
//                    System.out.println("Process Terminated due to wrong Selection");
            }
        }else {
            System.out.println("Process Terminated due to wrong Selection");
        }
    }
}
