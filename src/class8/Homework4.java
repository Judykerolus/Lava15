package class8;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        /*
        1) ask user for item price and item name
        2) accumulate the price
        3) tell the user how much total that they should pay
        4) if user give more money program should return a change
        5) thank you for shopping
         */
        Scanner input=new Scanner(System.in);
        int priceSum=0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the item you want to buy and the price");
            String item= input.next();
            int price= input.nextInt();
            priceSum=priceSum+price;
            System.out.println("This is the total amount you have to pay "+priceSum);
        }
        System.out.println("please pay for the items");
        int amountPaid=input.nextInt();
        if(amountPaid>priceSum){
        int change=amountPaid-priceSum;// calculating the change
            System.out.println("Here is your change");
        }else if(amountPaid<priceSum){
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");
    }
}
