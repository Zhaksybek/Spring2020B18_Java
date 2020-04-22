package day13_StringManipulation;

public class StringManipulation2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //            012345678
        String schoolName = str.substring(0,8);

        System.out.println(schoolName);

        String fullName = "Zhaksybek Satylgan";
        //                 0123456789
                                    //10 11 12 13 14 15 16 17

        String firstName = fullName.substring(0,9);
        String lastName = fullName.substring(10,17+1);

        System.out.println(firstName);
        System.out.println(lastName);


        System.out.println("==================================================================");

        String Murtaza = "Murtaza Nazeeri";
        //                01234567891011121314

        String firsName2 = Murtaza.substring(0,7);
        String lastName2 =Murtaza.substring(8, 14+1);

        System.out.println(firsName2);
        System.out.println(lastName2);

        String gmail = lastName2.concat("_").concat(firsName2).concat("@gmail.com");

        System.out.println(gmail);

        String s1 = "I love Java Programming language";
        //           0123456789
        String className = s1.substring(7);
        System.out.println(className);



        System.out.println("==================================================================");

        String s2 = "I like C# Programming";
               s2 = s2.replace("C#","Java");
        System.out.println(s2);

        String name = "COVID 18";
            name = name.replace("8","9");
        System.out.println(name);



        System.out.println("==================================================================");

        String s3 = "I like C#,   C#   Programming   C# C#  C#";
        s3 = s3.replaceFirst("C#","Java");
        System.out.println(s3);








    }
}
