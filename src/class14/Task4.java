package class14;

public class Task4 {
    public static void main(String[] args) {
       // 4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        /*StringBuilder st=new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse()); // this gave us a different result
        String str=st.toString(); // converting a StringBuilder to String so that we can call methods from String
        str.sp
         */
        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");// this splits the string to an array of words

        for(String word:arr){ // this is enhanced for loop to go through all the words
            for (int i = word.length()-1; i >=0 ; i--) { // this takes individual word and reverse it
                System.out.print(word.charAt(i)); // this will reverse letter by letter
            }
            System.out.print(" "); // this to add space between each word
        }

       /* for(String word:arr){
            System.out.println(new StringBuilder(word).reverse()+" ");
        }*/
        for (String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.println(st);
            System.out.println(" ");
        }
        }
    }

