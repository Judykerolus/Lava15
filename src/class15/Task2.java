package class15;

public class Task2 {
    String numberType(int number){
        if(number%2==0){
            return "even";
        }else{
            return "odd";
        }
    }

    public static void main(String[] args) {

        Task2 nT = new Task2();
        System.out.println(nT.numberType(15));
    }
}
