package homeWork20;

public class Employee {
    String name;
    int id;

    Employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    void workType(){
        System.out.println("Employee "+name+" will have light duty work type");
    }
    void workExperience(){
        System.out.println("Employee "+name+" doesn't need previous experience");
    }
}
class FullTime extends Employee{
    String workHours;
    int salary;
    FullTime(String name, int id,String workHours,int salary){
        super(name,id);
        this.workHours=workHours;
        this.salary=salary;
    }
    void fullT(){
        System.out.println("Full time employee will work "+workHours+" per week");
    }
}
class PartTime extends Employee{
    String schedule;
    int days;

    PartTime(String name, int id, String schedule, int days){
        super(name,id);
        this.schedule=schedule;
        this.days=days;
    }
    void partT(){
        System.out.println(name+"will be working "+days+"per week");
    }

    public static void main(String[] args) {
        FullTime test1=new FullTime("Daniel",12354,"40 hours",60000);
        test1.fullT();
        test1.workExperience();
        test1.workType();

        PartTime test2=new PartTime("David",45678,"night shift",3);
        test2.partT();
        test2.workExperience();
        test2.workType();

    }
}