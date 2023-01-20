package class8;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int cCredit = 0; cCredit < 10; cCredit++) {

            System.out.println("Would you like to apply for credit card?");
            String answer = input.next();// we use next only cause we need 1 word
            // if we need a sentence we use nextLine
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
