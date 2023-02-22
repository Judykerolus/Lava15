package project3;

public abstract class Marks {
    int mathGrade;
    int historyGrade;
    int scienceGrade;
    int englishGrade;

    abstract void getPercentage();
}
class StudentA extends Marks {

    StudentA(int historyGrade, int mathGrade, int scienceGrade) {
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.scienceGrade = scienceGrade;
    }

    void getPercentage() {
        int averageGrade = (historyGrade + mathGrade + scienceGrade) / 3;
        System.out.println("The average percentage of student A is "+ averageGrade);
    }
}

class StudentB extends Marks {

    StudentB(int historyGrade, int mathGrade, int scienceGrade, int englishGrade) {
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade= englishGrade;
    }

    void getPercentage() {
        int averageGrade = (historyGrade + mathGrade + scienceGrade + englishGrade) / 4;
        System.out.println("The average percentage of student B is "+ averageGrade);
    }

    public static void main(String[] args) {
            Marks[] mark={new StudentA(91,98,90),new StudentB(97,95,99,90)};
            for(Marks m:mark){
                m.getPercentage();

            }
        }
    }

