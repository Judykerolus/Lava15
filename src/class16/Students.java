package class16;

public class Students {
    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students st1=new Students();
        st1.name="Judy";
        st1.ID="S123";
        st1.numberOfStudents++;

        Students st2=new Students();
        st2.name="Jennifer";
        st2.ID="S124";
        st1.numberOfStudents++;
        System.out.println(Students.numberOfStudents);


    }
}
