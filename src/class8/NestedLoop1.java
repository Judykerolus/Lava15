package class8;

public class NestedLoop1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // outer for loop

            for (int j = 0; j < 5; j++) { // inner for loop
                System.out.println("i= "+i+" j "+j); // nested for loops are used more
                // than while or do because it's cleaner & easier to read
            }
            System.out.println("****************");
        }
    }
}
