package class13;

public class Task2 {
    public static void main(String[] args) {
        // create a String and print it in a reverse order(Sunday -> yadnuS)

        String str="Sunday";
        for (int i =str.length()-1; i>=0; i--){ // this to reverse any count of String not just specific word (genitic code)
            // we subtracting 1 to locate the last index
            System.out.println(str.charAt(i));
        }
    }
}
