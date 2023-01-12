package class3;

public class IfElse_8 {
    public static void main(String[] args) {

        int age=19; // you can print the variable or not
        if(age<18)

        {
            System.out.println("Time to play"); // = no print out ** if the statement is true it will print
            // if it's false it will not print
        }

        if(age>18)
        {
            System.out.println("Time to play"); // = Time to Play
        }

        boolean inSyntaxBootCamp=true;
        /*
        if conditions work based on boolean true or false if we have a true inside f ()
         */
        if(true)
        {
            System.out.println("Time to start practicing Java"); // = Time to .... etc
        }
        if(inSyntaxBootCamp)
        {
            System.out.println("Time to start practicing Java"); // = time to .... etc ** it's true it will always
            // print what's inside the if ()
        }
    }
}
