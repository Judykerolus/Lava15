package class15;

public class MPractice3 {
    /*
    create a method that takes an array of int sum all the elements
    from the array and return the sum.
     */
    // return is ==>int
    // parameters datatype ==> int[]
    // name is ==> create a name ex arraySum

   int arraySum (int[] input) {
       int[] arr = {10, 20, 30};
       int sum = 0;
       for (int num : arr) {
           sum += num;
       }
return sum;
   }
}
