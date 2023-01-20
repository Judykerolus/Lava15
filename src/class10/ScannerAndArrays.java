package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int[] numbers=new int[5];
        // below code manually store number in the array
       /* numbers[0]=40;
        numbers[1]=50;
        numbers[3]=60;
        numbers[2]=70;
        numbers[4]=80;
      */
        // Below code take the numbers from user and store them in the array its good but a lot of codes
        /*numbers[0]= input.nextInt();
        numbers[1]=input.nextInt();;
        numbers[3]=input.nextInt();;
        numbers[2]=input.nextInt();;
        numbers[4]=input.nextInt();;/*

         */
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
