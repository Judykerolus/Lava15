package Project;

public class Task3 {

    public static void main(String[] args) {

        int[][] num = {{11, 21, 31, 41, 51}, {20, 22, 24, 26, 28}};


        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
            }

        }
        System.out.println(sum);
    }
}
