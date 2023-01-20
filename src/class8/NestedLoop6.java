package class8;

public class NestedLoop6 {
    public static void main(String[] args) {
        /* 1 2 3 4 5
           1 2 3 4 5
           1 2 3 4 5
         */
        for (int i = 0; i < 3; i++) {// outer

            for (int j = 1; j <= 5; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}