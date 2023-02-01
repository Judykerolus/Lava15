package class16;

public class Task2 {
    /*
    2) Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String revString(String num) {
        String reverse = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reverse = reverse + num.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(revString("Baby"));

    }

}
