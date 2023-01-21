package class11;

public class Homework7 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 15, 20, 25},
                {55, 22, 45, 50},
                {100, 220, 450, 500},
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
