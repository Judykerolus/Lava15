package class14;

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        String str="jgfhjgKJKHUG25485@#$#@";
        System.out.println(str.replace("[^A-Za-z0-9]","").length());
    }
}
