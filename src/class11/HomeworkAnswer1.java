package class11;

import com.sun.security.jgss.GSSUtil;

public class HomeworkAnswer1 {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) { // j<i is the condition that changes the printout
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
