package class6;

public class LogicalAndDemo {
    public static void main(String[] args) {
        System.out.println(false); // false
        System.out.println(!false); // true
        boolean condition=!true;
        System.out.println(condition); // false

        String password="Pass123";
        System.out.println(password.equals("Pass123"));
        if(!password.equals("Pass123"));{
            System.out.println("Wrong password");// false so it will not print anything
            // if true it will print Wrong password
        }

        boolean isRaining=true;
        if(!isRaining){
            System.out.println("lets go for a walk");
        }else{
            System.out.println("Lets take the umbrella");// this line will be executed
        }
    }
}
