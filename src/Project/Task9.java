package Project;

public class Task9 {
    public static void main(String[] args) {
        int[] number = {11, 21, 31, 41, 51};
        int maxNum = number[0];
        int minNum = number [0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxNum) {
                maxNum = number[i];
            } else if (number[i] < minNum) {
                minNum = number[i];
            }
        }
            System.out.println("Maximum number is " + maxNum);
            System.out.println("Minimum number is " + minNum);
        }
    }

