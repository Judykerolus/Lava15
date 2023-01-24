package class12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username");
        String username= input.next();
        System.out.println("Enter your password");
        String password= input.next();
        System.out.println("Confirm your password");
        String ConPassword=input.next();
// we can't use switch case as we can't use logical operators (||, !=,>) with switch cases
        if(username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if (ConPassword.length()<8){
            System.out.println("Password is too short");
        }else if(ConPassword.contains(username)){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(ConPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}
