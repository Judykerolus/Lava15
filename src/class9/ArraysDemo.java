package class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name= "Slava";
        String name1="Safi";
        String name2="Jason";
        String name3="Nabi";
        String name4="Anees";
        System.out.println(name2);

        String [] names={"Slave","Safi","Jason","Nabi","Anees","Joseph"}; // names always starts from zero
        // as computers starts counting from 0
        System.out.println(names[1]);// it will print Safi
        System.out.println((names[3])); // it will print Nabi
        //System.out.println(names[500]); // we will get error because nothing is no name on location of 500
        // locations are indexes
        //System.out.println(names[-5]); // will give error as index can't be negative
        for (int i = 0; i < 6; i++) {
            System.out.println(names[i]);

        }
    }
}
