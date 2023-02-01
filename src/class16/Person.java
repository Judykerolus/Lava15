package class16;

public class Person {

    private double bankBalance=12500000;

    String Address="Street 123"; // when you don't mention anything default access level is applied
    public String name="Jon Snow";
    private void printPhonePassword(){
        System.out.println("password 12345");
    }

    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.bankBalance);
        System.out.println(person1.Address);
        System.out.println(person1.name);
        String str="ghhgfgj";
    }
}
