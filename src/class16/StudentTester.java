package class16;

public class StudentTester {
    public static void main(String[] args) {
        Student stud1=new Student();
        stud1.name="Zafar";
        stud1.id="123";
        stud1.age=22;
        stud1.weight=70;
        stud1.schoolName="Syntax";

        Student stud2=new Student();
        stud2.name="Hamid";
        stud2.id="456";
        stud2.age=25;
        stud2.weight=86;
        //stud2.schoolName="Syntax";

        Student stud3=new Student();
        stud3.name="Nelson";
        stud3.id="789";
        stud3.age=26;
        stud3.weight=90;
        //stud3.schoolName="Syntax";
        System.out.println(stud3.schoolName);// if we switch the instance variable to static
        // we will get Syntax printed even thu we didn't assign it to stud3
    }
}
