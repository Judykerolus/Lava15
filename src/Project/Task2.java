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
    }
}
