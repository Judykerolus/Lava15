package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        //String day="Monday";
        System.out.println("please enter the day");
        String day= value.next();
        if(day.equalsIgnoreCase("Monday")|| day.equals("Friday")){ // equalsIgnoreCase to ignore
            // upper or lower cases
            System.out.println("No class today");
        } else if(day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class enjoy");
        } else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("Wrong day entered");
        }
    }
}
