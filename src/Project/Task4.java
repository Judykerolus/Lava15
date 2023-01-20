package Project;

public class Task4 {
    public static void main(String[] args) {

        int[][] numbers = {{5, 10, 15, 20, 25}, {30, 33, 40, 43, 50}};
        System.out.println("even numbers are :");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if ((numbers[i][j]) % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("odd numbers are :");
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers[a].length; b++) {
                if ((numbers[a][b]) % 2 != 0) {
                    System.out.print(numbers[a][b] + " ");
                }
            }
        }
    }
}
