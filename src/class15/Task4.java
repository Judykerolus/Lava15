package class15;

public class Task4 {
    String hello (String country){
        switch (country) {
            case "USA":
                return "Hello";
            case "Mexico":
                return "Hola";
            case "Egypt":
                return "Ahlan";
            default:
                return "Invalid";
        }
        }

    public static void main(String[] args) {
        Task4 sh=new Task4();
        System.out.println(sh.hello("Egypt"));
    }
}
