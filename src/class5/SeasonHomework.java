package class5;

import java.util.Scanner;

public class SeasonHomework {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month= value.next();
        if(month.equals("June")||(month.equals("July")||(month.equals("August")))){
            System.out.println("You are born in summer");
        }else if(month.equals("September")||(month.equals("October")||(month.equals("November")))){
            System.out.println("You are born in autumn");
        }else if(month.equals("December")||(month.equals("January")||(month.equals("February")))){
            System.out.println("You are born in winter");
        }else if(month.equals("March")||(month.equals("April")||(month.equals("May")))){
            System.out.println("you are born in spring");
        }

    }

}
