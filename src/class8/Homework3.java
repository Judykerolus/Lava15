package class8;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two Number starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <=end ; i++) {
            //System.out.println(i); to test
            if(i%2==0){
                evenSum+=i; // can also be written like
                //System.out.println("Even number "+i); to test
            }else{
                //System.out.println("Odd number "+i); to test
                oddSum=oddSum+i; // can also be write like this oddSum+=i
            }
        }
        System.out.println("Sum of all the Even Numbers "+evenSum);
        System.out.println("Sum of all the odd Number "+oddSum);
    }
}
