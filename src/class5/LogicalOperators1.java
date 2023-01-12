package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        System.out.println(true||true); //true
        System.out.println(true||false); //true
        System.out.println(false||false);//false
        System.out.println(false||true);//true
        System.out.println(false||true|false|false);//true (if you have at lease one true the whole condition will
        // be true.

        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers){
            System.out.println("I am happy"); // I am happy
        }else{
            System.out.println("I am sad");
        }
        boolean wifi=false;
        boolean fiveG=false;
        if(wifi||fiveG){
            System.out.println("You are good for browsing the internet");
        }else{
            System.out.println("Either are not working"); // either are not working
        }

    }
}
