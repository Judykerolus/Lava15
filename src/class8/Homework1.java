package class8;

public class Homework1 {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            if(i%3==0){ // you can also use if(i%3!=0) sout i
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
