package class15;

public class Task6 {
    char getGrade (int score){
        if( score >= 90) {
            return 'A';
        } else if (score >=80 && score<90) {
            return 'B';
        } else if (score >=70 && score<80) {
            return 'C';
        } else if (score >=50 && score<70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Task6 gG=new Task6();
        System.out.println(gG.getGrade(75));
    }
}
