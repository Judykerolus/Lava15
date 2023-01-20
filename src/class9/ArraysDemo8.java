package class9;

public class ArraysDemo8 {
    public static void main(String[] args) {

      // write a program that can tell us how many times the number 10.5 is present
        // in the array

        double [] numbers={10.5,12.0,45,10.5,23,10.5};

        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==10.5){
              count++; // can also be written as count=count+1;
            }
        }
          System.out.println(count);

        }
    }