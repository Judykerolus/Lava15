package class3;

public class ShortHandOperator_4 {
    public static void main(String[] args) {
        int number=10;
        //number=number+10;
        //number+=10; // this is the same as number=number+10 but shortcut
        // whatever value is stored in number variable add 10 to it
        number*=20;
        // you can also update the vale or the operator
        System.out.println(number);

        int number2=20;
        number2-=10;
        System.out.println(number2); // 10

        int number3=100;
        number3/=10;
        System.out.println(number3); // 10


    }
}
