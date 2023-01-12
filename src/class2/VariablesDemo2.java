package class2;

public class VariablesDemo2 {
    public static void main(String[] args) {
        int numberBox=10;
        numberBox=20; // we reassigned 20 to numberBox instead of 10 this way, Java will overwrite it to 20 when you print it.
        System.out.println(numberBox);
        numberBox=200;
        System.out.println(numberBox);

        int number=20;
        System.out.println(number*1);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);
        System.out.println("*******");
        int number2=20;
        int number3=20;
        int number4=20;
        System.out.println(number*1);
        System.out.println(number2*2);
        System.out.println(number3*3);
        System.out.println(number4*4);



    }
}
