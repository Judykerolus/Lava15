package class3;

public class RelationalOperators_6 {
    public static void main(String[] args) {
        int number=10;
        int number2=10;
        System.out.println(number+number2); // this is  a regular arithmetic operations int variable and int output

        boolean result=20>10;
        /*
        arithmetic operator
        int + int= int
        int/int= int
        int- int= int

        Relational Operators
        > greater than
        => greater or equal
        == equal to
        != not equal to
        < less than
        =< less than ot equal
         */
        System.out.println(20>10); // is 20 greater than 10 = true
        System.out.println(5>10); // is 5 greater than 10 = false
        System.out.println(5!=10); // is 5 not equal to 10 = true
        System.out.println(5==10); // is 5 equal to 10 = false
        System.out.println(5==5); // is 5 equal to 5
        System.out.println(10>=20); // is 10greater or equal to 20 = false
        System.out.println(10<=20); // is 10 less than or equal to 20 = true
        System.out.println(10<=10); // is 10 less than or equal to 10 = true
        // in case of  less/great or equal to will be true if only one of the conditions happened

    }
}
