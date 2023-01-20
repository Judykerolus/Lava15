package class8;

public class NestedLoop5 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) { // outer
            if (i==1) {
                System.out.println();// to print empty line
                continue;
            }
            for (int j = 0; j < 5; j++) { // inner
                //System.out.print("o"+"");
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
