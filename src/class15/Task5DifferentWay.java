package class15;

public class Task5DifferentWay {

    /*
    Write a method to return whether given number is prime or not?

    return type => boolean
    name=> isPrime
    parameter => int number
     */
    boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

}
