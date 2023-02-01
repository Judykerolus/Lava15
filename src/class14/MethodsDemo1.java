package class14;

public class MethodsDemo1 {
    public static void main(String[] args) {

        int [] arr1={10,20,30,45,50};
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {// for loop
            sum = sum + arr1[i];
        }
            System.out.println(sum);

        int [] array2={10,10,10,20,30};
        int sum2=0;
        for(int number:array2){// enhanced for loop another way to the for loop
            sum2+=number;
        }
        System.out.println(sum2);
        }
    }
