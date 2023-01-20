package class5;

public class AverageScoreHomework {
    public static void main(String[] args) {
        int qScore=30;
        int midScore=5;
        int finalScore=30;
        int averageScore=(qScore+midScore+finalScore);

        if (averageScore>=90){
            System.out.println("Grade A");
        }else if(averageScore>=70 && averageScore<90){
            System.out.println("Grade B");
        }else if(averageScore>=50 && averageScore<70){
            System.out.println("Grade C");
        }else if(averageScore<50){
            System.out.println("Grade F");
        }
    }
}
