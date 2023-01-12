package class4;
import java.util.Scanner;

public class LoanScanner {
    public static void main(String[] args) {
        Scanner amount =new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");
        int LoanAmount=amount.nextInt();
        if(LoanAmount<=200000){
            System.out.println("We can lend you the money");
        }else{
            System.out.println("Sorry you are not approved");
        }
    }
}
