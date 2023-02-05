package homeWok19;

public class TeacherTest {
    public static void main(String[] args) {

        Teacher test1 = new Teacher();
        test1.name="Asel";
        test1.ID=2354;
        test1.tests();
        test1.homework();
        test1.teaches();
        test1.punishes();

        System.out.println("----------------");

        MathTeacher test2=new MathTeacher();
        test2.name="Asghar";
        test2.ID=4568;
        test2.subject="Math";
        test2.grade="5th";
        test2.teaches();
        test2.homework();
        test2.teaches();
        test2.punishes();
        test2.math();

        System.out.println("-----------------");

        ChemistryTeacher test3=new ChemistryTeacher();
        test3.name="Asghar";
        test3.ID=4568;
        test3.lab=2;
        test3.years=3;
        test3.teaches();
        test3.homework();
        test3.teaches();
        test3.punishes();

        System.out.println("-------------------");

        PianoTeacher test4=new PianoTeacher();
        test4.name="Asghar";
        test4.ID=4568;
        test4.level="beginners";
        test4.teaches();
        test4.homework();
        test4.teaches();
        test4.punishes();
        test4.play();

    }
}
