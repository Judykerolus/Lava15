package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {
       /*
       Limitations of foreach loop
        */
        int[] numbers={10,13,20,25,45,50};
        // We can't update the elements in for each loop we don't have access to the index;

        for (int x:numbers) {
            if(x%2!=0){
                x=0; // it will give us an error it will not to update the value
            }
        }
    }
}
