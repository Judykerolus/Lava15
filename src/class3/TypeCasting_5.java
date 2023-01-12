package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        // byte shorterNumber=number; // Java will give us an error
        byte shorterNumber=(byte)number;
        System.out.println(number);
        /*
        Type casting is fitting a value of a box to another box even-though if Java thinks that it might not fit
        ex. long is a bigger box and byte is small box Java will give you an error, but if we still want to continue
        we can override it with adding (new box nme)
         */
        float f=10.5f;
        int num=(int)f; // when you type casting(converting from one data type to another) from float to int,
        // Java will ignore the decimal.
        System.out.println(num);
        /*
        byte
        short
        int
        long
        float
        double
        if you try to store the content from a smaller box to a larger box Java doesn't complain
        because the content can easily fit inside the larger box but if we try the other way around we get an
        error, and we need to type cast it to store the contents
         */
        byte b=10;
        int number2=b;
        // short c= number2;
        short c=(short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int) eggs; // this way when you want to round up for the whole part ignoring the decimals
        System.out.println(wholePart);

        System.out.println((char)98); // a
        // you can also convert number to char or the opposite, **will get back to it later again it's not common to use

    }
}
