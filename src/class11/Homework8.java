package class11;

public class Homework8 {
    public static void main(String[] args) {
        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Colombia",},
                {"Germany", "France", "Italy"},
                {"China", "India", "Japan"}};
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                sum++;

                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println("****************");

        for (String[] arr : countries) {
            for (String names : arr) {
                System.out.print(names + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
