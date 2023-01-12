package class4;
import java.util.Scanner;

public class DmvScanner {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("What is your age?");
        int age= value.nextInt();
        if(age>=18){
            System.out.println("You are eligible to get your driver license");
        }else{
            System.out.println("You can only get learning permit");
        }
    }
}
