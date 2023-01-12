package class4;
import java.util.Scanner;

public class SalaryScanner {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("What is the number of worked years?");
        int years = value.nextInt();
        System.out.println("What is the annual salary?");
        int salary = value.nextInt();
        if (years >= 5) {
            System.out.println("You are eligible for the bonus");
        }else{
            System.out.println("You are not eligible for the bonus");
        }
        if (salary > 50000) {
            System.out.println("Your bonus is $5000");
        }else{
            System.out.println("Your bonus is $3000");

            }
        }
    }

