package day13_StringManipulation;
// import java.lang
public class stringManipulations {
    public static void main(String[] args) {


        //   str.charAt(5)

        String str = "Cybertek";
        //            01234567

             char ch1 = str.charAt(5); // ==>t
        System.out.println(ch1 == 'A');  // false

        String jake = "Zhaksybek";
                    // 012345678


        System.out.println(ch1 == 'T');
        //                  't' == 'T'   / false

                       int totalLenght= str.length();
                       System.out.println(totalLenght);


         String str2 = "Today is great day, Java is Fun"; //
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);

        System.out.println("==================================================================");

        String s1 = "Cybertek";
              // s1 = " Very good ";
              s1 = s1.concat(" School"); // "Cybertek School"

        System.out.println(s1);

        System.out.println("==================================================================");

        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language")     ); //Java is programming language
        System.out.println(s2);// Java

        System.out.println("==================================================================");

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        System.out.println("==================================================================");

        String r1 = "Java is fun";
            r1 = r1.concat(", and it's easy");
        System.out.println(r1);

        System.out.println("==================================================================");

        String name1 = "CYBERTEK";
             name1= name1.toLowerCase(); //==>cybertek
        System.out.println(name1);

        System.out.println("==================================================================");


        String name2 ="cybertek school";
             name2=  name2.toUpperCase(); //CYBERTEK SCHOOL

               System.out.println(name2);

        System.out.println("==================================================================");

        String A1 ="             Today is a great day!              ";
        A1= A1.trim();
        System.out.println(A1);









        System.out.println("==================================================================");








    }
}
