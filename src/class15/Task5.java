package class15;

public class Task5 {

    String prime(int number) {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return "Prime";
            } else {
            }
        }
        return "Not Prime";
    }

    public static void main(String[] args) {
        Task5 pm=new Task5();
        System.out.println(pm.prime(3));
    }
}
