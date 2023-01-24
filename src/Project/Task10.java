package Project;

public class Task10 {
    public static void main(String[] args) {
        int[] number={25,30,15,20,10};
        int firstLarge=number[0];
        int secondLarge=number[1];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > firstLarge) {
                secondLarge = firstLarge;
                firstLarge = number[i];
            }else if (number[i]>secondLarge && number[i]!=firstLarge){
                secondLarge=number[i];
            }
        }
        System.out.println("The second largest number is " +secondLarge);
    }
}

