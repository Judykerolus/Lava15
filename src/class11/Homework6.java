package class11;

public class Homework6 {
    public static void main(String[] args) {

        int[][] matrix={ {10,20,30},
                         {55,22,45},
                         {100,220,450},
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                sum = sum + matrix[i][j];
            }
        }
                System.out.println(sum);
    }
}
