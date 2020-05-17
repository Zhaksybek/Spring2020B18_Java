package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        facebook.setUserName("Zhaksybek");
        facebook.setPassWord("mrjakson02");

        System.out.println(  facebook.getUserName()  );
        System.out.println(  facebook.getPassWord() );



    }

}
