package class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                         {45,55,66},
                         {30,40,20,10,25}

        };
        System.out.println(matrix[2][4]);// 25
        System.out.println(Arrays.toString(matrix[0])); // [10,20,30]
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[0][i]); // 10 20 30
        }
        int[] number=matrix[0]; // getting complete first array from 2D array
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]); // 10 20 30

        }
    }
}
