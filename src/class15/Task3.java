package class15;

public class Task3 {

    // when we are asked to just print something without a return we should you void method
    // return type => void
    // name => palindrome
    // parameters=> String inputStr


    String palindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            return "palindrome";
        } else {
            return "Not palindrome";
        }
    }
    public static void main(String[] args) {
        Task3 pl=new Task3();
        System.out.println(pl.palindrome("mom"));

    }
    }




