package class15;

public class MethodPractice2 {
        // create a method that takes a String reverse it and return the reversed String.
        // call the method reverseStr
        // return is String
        // datatype String
        // name is reverseStr
        String reverseStr(String input){
            String newStr="";
            for (int i = input.length()-1; i >=0 ; i--) {
                System.out.println(input.charAt(i));
            }
            return newStr;
            }
         String reverseStr1(String input){
            return new StringBuilder(input).reverse().toString();

        }
    }

