package Project;

public class Task7 {
        public static void main(String[] args) {
            // number>1
            // numbers should be divisible only by itself and 1 only
            // ex: 2(1,2) P , 3(1,3) P, 4(1,2,4)
            int number= 30;
            boolean isPrime = false;
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");
        }
    }


