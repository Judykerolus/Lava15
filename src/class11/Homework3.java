package class11;

public class Homework3 {
    public static void main(String[] args) {


        String[][] scores={{"Judy","Jennifer","Michael","Peter"},
                           {"A","A+","B","B+"}};
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if(scores[i][j].equals("A")||scores[i][j].equals("B")){
                    System.out.println(scores[0][j]);
                }
            }
        }

    }
}
