package class5;

public class LogicalOperators3 {
    public static void main(String[] args) {


        if(10>5 || 4>6){
            System.out.println("1");// 1 will print on the console
        }else{
            System.out.println("2");
        }
        String name="Adam";
        int age=31;
        if(name.equals("Adam")&& age==30){
            System.out.println("You are the Adam from batch13");
        }else{
            System.out.println("I don't know you");
        }

        boolean isTrue=false;
        if(!isTrue){ // this makes the condition switch from false to true
            System.out.println("You got it"); // result is true
        }else{
            System.out.println("Need more practice");
        }
    }
}
