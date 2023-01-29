package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
        MethodPractice nm = new MethodPractice();
        boolean isEven = nm.isEven(15);
        System.out.println(isEven);
        boolean isEven2 = nm.isEven(100);// this to reuse the number again not just print it
        System.out.println(isEven2);//
        boolean isEven3 = nm.isEven(12);
        System.out.println(nm.isEven(20));// this way if you are not using this anywhere else
    }

}
