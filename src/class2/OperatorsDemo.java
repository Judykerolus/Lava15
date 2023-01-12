package class2;

public class OperatorsDemo {
    public static void main(String[] args) {

        int number=10;
        //int number=20; // we can't name two boxes with same name for ex (number) java won't process the code

        int number1=10;
        int number2=20;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        /*
        If the answer should be in decimals for ex 0.5 you are using the wrong datatype (int)
        java will ignore anything after the decimal and give incomplete answer ex 0.
         */
        /*
        if you have to store whole numbers always use int
        if you have to store decimal numbers always double
        if you have to store characters always use String
         */
        System.out.println(number2/number1);

    }
}
