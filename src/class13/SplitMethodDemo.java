package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from batch 15.";
        String[] strArr= str.split("[.?!]");
        System.out.println(strArr.length);// this to give how many sentence it split for
        System.out.println(strArr[2].trim());// trim to get rid of the space before the sentence
        // whenever we are working with arrays we use the length without ()
        // we use length() when we use String
    }
}
