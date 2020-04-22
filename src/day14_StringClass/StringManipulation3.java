package day14_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        String str1 ="CYBERTEK";
        String str2 = "cyBerTek";

        System.out.println( str1.equals(str2) );  //false

        System.out.println( str1.equalsIgnoreCase(str2) );


        String gmail = "cybertekschool@gmail.com";
        String  UserInpiutGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equals(UserInpiutGmail);

        String s1 = "Cybertek School";

        boolean r1 = s1.contains("School"); // true     (Case sensetive)

        System.out.println(r1);

        System.out.println("---------------------------------------------------");

        String Password = "mmasd12345";

        if (Password.contains(" ")){
            System.out.println("Password cannot have space it");
        }else {
            System.out.println("valid password");
        }

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

         String webAdress = "wWw.amazon.com";
                webAdress = webAdress.toLowerCase();
         if (webAdress.startsWith("www.")){
             System.out.println("www. is valid");
         }else {
             System.out.println("Invalid");
         }



         String s3 = "Unated States";
        System.out.println( s3.startsWith("U")  );

        String s4 = "Cybertek School";
        System.out.println( s4.endsWith("l") );

        System.out.println( s4 );



        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        String email = "CybertekSchool@yahoo.com";

        if ( email.endsWith("@gmail.com") ){

            System.out.println("Valid Gmail");

        }else {
            System.out.println("Invalid gmail");
        }






    }
}
