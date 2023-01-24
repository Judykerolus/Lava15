package class12;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        // Creating an object of the String class
        String strObj=new String("Java");
        // another shorter way of creating an object of String class
        // this is the most common wat to create the objects of String class
        String strOj2="Java";
        System.out.println(strOj2.length());
        String str="Banana ";
        int len=str.length();// this method counts the length of String str
        System.out.println(len);// it will print 7
        String name="Hamid Poya ";
        if (name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }


    }
}
