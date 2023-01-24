package Project;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Before swapping");
        int number1=15;
        int number2=20;
        System.out.println("value of number1 "+number1);
        System.out.println("value of number2 "+number2);
        System.out.println("After swapping");
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println("value of number1 "+number1);
        System.out.println("value of number2 "+number2);
    }
}
