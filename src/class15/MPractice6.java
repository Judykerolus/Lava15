package class15;

public class MPractice6 {
    /*
    Create a method createEmail().
    Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:
    createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String createEmail(String userName, String lastName, String emailType) {
        return userName + lastName + "@"+ emailType +".com";
    }

    public static void main(String[] args) {
    MPractice6 mp=new MPractice6();
        System.out.println(mp.createEmail("John","Snow","gmail"));
    }
}
