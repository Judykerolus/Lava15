package class11;

public class DogTesterHomework {
    public static void main(String[] args) {

        DogHomework Husky=new DogHomework();
        Husky.name="Ace";
        Husky.breed="Husky";
        Husky.age=2;
        Husky.weight=50;
        Husky.color="Black";
        Husky.bark();
        Husky.sleep();
        Husky.eat();

        System.out.println("**********");

        DogHomework Bulldog=new DogHomework();
        Bulldog.name="Seven";
        Bulldog.breed="Bulldog";
        Bulldog.age=1;
        Bulldog.weight=30;
        Bulldog.color="Brown";
        Bulldog.bark();
        Bulldog.sleep();
        Bulldog.eat();

        System.out.println("***********");

        DogHomework Labrador=new DogHomework();
        Labrador.name="Coco";
        Labrador.breed="Labrador";
        Labrador.age=3;
        Labrador.weight=25;
        Labrador.color="Golden brown";
        Labrador.bark();
        Labrador.sleep();
        Labrador.eat();

    }

}
