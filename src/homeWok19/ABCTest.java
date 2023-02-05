package homeWok19;

public class ABCTest {
    public static void main(String[] args) {

    A test1=new A();
       test1.type="Alphabet";
       test1.size="Uppercase";
       test1.printF();

        System.out.println("----------------");

       B test2=new B();
       test2.type="Alphabet";
       test2.size="Uppercase";
       test2.print="B,b";
       test2.printF();
       test2.use();

        System.out.println("--------------------");

        C test3=new C();
        test3.type="Alphabet";
        test3.size="Uppercase";
        test3.print="C,c";
        test3.sound="cee";
        test3.printF();
        test3.use();
        test3.language();
    }
}
