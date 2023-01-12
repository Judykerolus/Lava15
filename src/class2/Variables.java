package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below Line is reserving a box in the computer's memory.
        we are calling it box1 if we need the information that we are storing inside this box
        we can simply say to the computer give us the contents of box1.
        box1=> is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        // If we are printing something from a box we don't need ""
        System.out.println(box1); // bring the contents of the box1 and print them on the console
        /*
         To store whole numbers (Numbers without decimals point) ex ( 10 20 3000 10000)
         we have 4 different types of boxes.
         1) byte (byte holds max 127 & for minus it holds max -128)
          2) short ( short up to 32767 & for minus it holds max -32768)
           3) int ( most common type of boxes as it holds up to 123456484)
           4) long
         */
        byte box2=127;
        byte box3=-128;
        short box4=32767;
        int biggerBox=123456484;
        long maxBox=15131351465464L; // we need to add letter L after any longer number to tell the computer that this is a long number

        short myBox=10000;
        System.out.println(myBox);

    }

}
