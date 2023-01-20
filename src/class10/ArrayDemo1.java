package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50};
        System.out.println(numbers[4]);
        // can we print two numbers from an array
        System.out.println(numbers[1]+" "+numbers[4]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("***********");
        // Enhanced for loop use it whenever is possiable
        for (int value:numbers) {
            System.out.println(value);
        }
    }
}
