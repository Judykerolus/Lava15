package class11;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iPhone=new Phone();
        iPhone.name="iphone13";
        iPhone.color="Purple";
        iPhone.make="Apple";
        iPhone.ring();
        iPhone.features();
        iPhone.call();

        System.out.println("*********");

        Phone Pixel=new Phone();
        Pixel.name="Pixel 7";
        Pixel.color="Black";
        Pixel.make="Google";
        Pixel.ring();
        Pixel.features();
        Pixel.call();

        System.out.println("*********");

        Phone Samsung =new Phone();
        Samsung.name="Samsung Galaxy S22";
        Samsung.color="Black";
        Samsung.make="Samsung";
        Samsung.ring();
        Samsung.features();
        Samsung.call();

    }
}
