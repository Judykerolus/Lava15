package class15;

import static class16.Task2.revString;

public class Task1 {
    int LargeNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Task1 lm=new Task1();
        System.out.println(lm.LargeNumber(15,16));
        System.out.println(revString("Baby"));
    }

}

