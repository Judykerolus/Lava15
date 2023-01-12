package class4;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CityScanner {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=value.next();
        System.out.println("Please enter your city's temperature");
        int temperature=value.nextInt();
        double celsius=((temperature-32)/0.5556);
        System.out.println("The temperature of "+city+" is "+celsius);
    }
}
