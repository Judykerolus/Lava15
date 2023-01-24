package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 4 countries");
        String[] countries = new String[4];
        for (int i = 0; i < countries.length; i++) {
            countries[i] = input.nextLine();
        switch (countries[i]) {
                case "USA":
                    System.out.println("Washington is the capital of USA");
                    break;
                case "Egypt":
                    System.out.println("Cairo is the capital of Egypt");
                    break;
                case "France":
                    System.out.println("Paris is the capital of France");
                    break;
                case "England":
                    System.out.println("London is the capital of England");
                    break;
                default:
                    System.out.println("Invalid");
                    System.out.println(countries[i]);
            }
        }
        System.out.println(Arrays.toString(countries));

        System.out.println("************");

        System.out.println("Please enter 4 countries");
        String[] country=new String[4];
        String[] capital=new String[4];
        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < capital.length; j++) {
                country[i]=input.next();
                capital[j]=input.next();
                System.out.println("The capital of "+country[i]+" is "+capital[j]);

            }
        }


    }
}
