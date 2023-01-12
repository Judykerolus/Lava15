package class3;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age=10; // requesting the computer to create a box of type int and store a value 10 in it.
        int salary; // only create a box of type int and don't assign any value to it.
        salary=120000; // updating a variable reassigning a value;
        System.out.println(salary);
        String name,city,country; // we can create multiple empty boxes in a single line of code
        // but we can't give value to multiple boxes at the same line
        char gender, letter;
        name="Daria";
        //System.out.println(city); I have not stored anything inside the city variable that's why Java is
        // confused what to print.
        System.out.println(name);

    }
}
