package Project;

public class Task5 {
    public static void main(String[] args) {
        int[][] num = {{11, 21, 31, 41, 51}, {20, 22, 24, 26, 28}};
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]%2==0){
                    evenSum=evenSum+num[i][j];
                }else{
                    oddSum=oddSum+num[i][j];
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
