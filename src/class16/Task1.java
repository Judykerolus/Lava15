package class16;

public class Task1 {
    /*
    Create a method that will accept an array as parameters
    and will return a sum of all elements from that array. Method should be visible only within same package
    and accessible by creating an instance(object) of the class
     */
    int numSum(int[]arr){// if we add static next to the method we can then call the method without
        //creating an object or instance

        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]array={5,10,20};
        Task1 object1=new Task1();
        System.out.println(object1.numSum(array));
    }
}
