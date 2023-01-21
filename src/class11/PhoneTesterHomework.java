package class11;

public class PhoneTesterHomework {
    public static void main(String[] args) {
        PhoneHomework iPhone=new PhoneHomework();
        iPhone.name="iphone13";
        iPhone.color="Purple";
        iPhone.make="Apple";
        iPhone.ring();
        iPhone.features();
        iPhone.call();

        System.out.println("*********");

        PhoneHomework Pixel=new PhoneHomework();
        Pixel.name="Pixel 7";
        Pixel.color="Black";
        Pixel.make="Google";
        Pixel.ring();
        Pixel.features();
        Pixel.call();

        System.out.println("*********");

        PhoneHomework Samsung =new PhoneHomework();
        Samsung.name="Samsung Galaxy S22";
        Samsung.color="Black";
        Samsung.make="Samsung";
        Samsung.ring();
        Samsung.features();
        Samsung.call();

    }
}
