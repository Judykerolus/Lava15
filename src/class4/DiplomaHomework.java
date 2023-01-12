package class4;

public class DiplomaHomework {
    public static void main(String[] args) {
        boolean diploma=true;
        double gpa=3.9;
        if(diploma){
            System.out.println("Congratulations");
        }else{
            System.out.println("You need to get a degree");
        }
        if(gpa>=3.5){
            System.out.println("You are eligible for scholarship");
        }else{
            System.out.println("You should have study harder");
        }
    }
}
