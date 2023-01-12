package class4;

public class MortgageHomework {
    public static void main(String[] args) {
        int rate=4;
        int price=500000;
        if(rate>4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("User will consider buying");
        }
        if(price>200000){
            System.out.println("User will take a loan");
        }else{
            System.out.println("User will pay cash");
        }
    }
}
