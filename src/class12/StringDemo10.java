package class12;

public class StringDemo10 {
    public static void main(String[] args) {
        String str="Java is not pain";
        System.out.println(str.indexOf("J"));// we can also use a word not just a letter
        System.out.println(str.indexOf("a"));// since a presents multiple times this method will
        // only give us the the first location of the "a"
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i)+" has the index "+i);
        }
    }
}
