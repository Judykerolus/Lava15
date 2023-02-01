package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str=" KJHGDSFGHJJkjkhgfhfjgk1245255!@#$$";
        // replaces all uppercase letters from A to Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        // replaces all lowercase letters from a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        // replaces all numbers from 0 to 9
        System.out.println(str.replaceAll("[0-9]","#"));
        // replaces all uppercase letters from A to Z & lowercase from a-z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        // replaces all uppercase letters from A to Z & lowercase from a-z & numbers 0-9
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // DO NOT replace all uppercase letters from A to Z & lowercase from a-z & numbers 0-9
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));// ^ means don't replace

        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));// "" means remove
    }
}
