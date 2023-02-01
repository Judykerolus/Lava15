package class15;

public class Task3DifferentWay {
    void palindrome(String str) {
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + "Not is palindrome");
        }
    }

    public static void main(String[] args) {
        Task3DifferentWay pal = new Task3DifferentWay();
        pal.palindrome("dad");
    }
}
