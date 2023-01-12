package class4;
import java.util.Scanner;

public class CreditCardScanner {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean credit = value.nextBoolean();
        if (false) {
            System.out.println("Would you like to get one");
        } else if(true){
            System.out.println("What is the balance on your card?");
            int balance = value.nextInt();
            if (balance > 1000) {
                System.out.println("You need to pay off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }
    }
}

