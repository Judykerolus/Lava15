package class5;

import java.util.Scanner;

public class HeightsHomework {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height= input.nextInt();
        if(height<60){
            System.out.println("Short");
        }else if (height>=60 && height<=72){
            System.out.println("medium");
        }else if(height>72){
            System.out.println("tall");
        }
    }
}
