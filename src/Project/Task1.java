package Project;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers=new int[5];
        numbers[0]= input.nextInt();
        numbers[1]=input.nextInt();
        numbers[3]=input.nextInt();
        numbers[2]=input.nextInt();
        numbers[4]=input.nextInt();
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
            System.out.println(sum);

        }
    }

