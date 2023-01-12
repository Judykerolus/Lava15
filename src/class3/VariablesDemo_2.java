package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        int number1=10; // to rename a variable that you used in multiple locations you will need
        // right click> refactor> rename, it will rename it in all different locations.
        System.out.println(number1);
        int age=10;
        System.out.println(age);
        age=20;
        System.out.println(age);
        int number=10;
        age=number; // i am saying to java replace the value of age with the value of
        // number variable
        System.out.println(age);
        age=age+20;
        System.out.println(age);
    }
}
