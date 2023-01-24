package Project;

public class Task11 {
    public static void main(String[] args) {

        String[] names = {"Judy", "Luz", "Fariha", "Florin", "Judy"};

        for (int i = 0; i < names.length; i++) {
            for (int j = 1 + i; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println(names[j]);
                }
            }
        }
    }
}