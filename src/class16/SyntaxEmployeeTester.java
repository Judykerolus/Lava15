package class16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empID = 1234;
        emp1.salary=60000;
        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);

        SyntaxEmployee emp2 = new SyntaxEmployee();
        emp2.empID = 5678;
        emp2.salary=65000;
        System.out.println(emp2.empID);
        System.out.println(emp2.salary);
        System.out.println(emp2.CEO);
    }
}
