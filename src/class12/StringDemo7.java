package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str = "I love java";
        boolean startsWith = str.startsWith("I");// it will print true as long as I is upper case if lowercase it will be false
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));

        // Method chaining is when multiple methods are called on the same line
        // only those methods can be chained which returns a String
        System.out.println(str.toLowerCase().startsWith("i"));// this will print true
        // because we added toLowercase method to it

        System.out.println(str.contains("java"));// method to check if a word is present or not
    }
}
