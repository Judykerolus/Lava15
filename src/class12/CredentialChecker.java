package class12;

public class CredentialChecker {
    public static void main(String[] args) {

       String str="Java is love";
        char character=str.charAt(2);
        /*System.out.println(character);
        for (int i=0; i<str.length() ;i++) {
            System.out.println(str.charAt(i));
        }
        */
        int count=0;
        for (int i=0; i<str.length() ;i++){
            if(str.charAt(i)=='a'){
                count++;
                System.out.println(count);

            }
        }
    }
}
