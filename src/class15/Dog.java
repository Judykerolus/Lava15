package class15;

public class Dog {

    String name; // not a local variable, they are instance variables which are outside method {}
    String breed;
    String color;

    static int numbers=4; // static variable which is inside a class but outside any {}
    // and combined with static word

    void printFood(){
        String food="Meat";// food is local variable which is inside method {}
        System.out.println(food);
        System.out.println(name);// variable name can be accessed here as it's instance
    }

}
