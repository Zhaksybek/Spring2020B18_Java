package day13_StringManipulation;

public class strManup_trMine {
    public static void main(String[] args) {

        // every String have index:
        String str = "Cybertek";
        //            01234567
         char ch1 = str.charAt(7);
        System.out.println(ch1);

        String fullName = "Akerke Satylgan";
         //                012345678901234
           char fn = fullName.charAt(1);
        System.out.println(fn);


        String str1 = "California State";
                   //  0123456789012345

        char ch2 = str1.charAt(9);// t
        System.out.println(ch2);


        String str2 = "My name is Jack";
        //             012345678901234
        int maxIndex = str2.length()-1;
        System.out.println("Max Index is: "+ maxIndex);

        String st3 = "Hello world, I love you!";
         //           012345678901234567890123    // ==>23
        int maxIndex2 = st3.length()-1;
        System.out.println(maxIndex2);


        String str4 = "I am learning Java Programming language";
        int maxIndex3 = str4.length()-1;
        System.out.println(maxIndex3);

        String str5 = "My originally country is Kazakhstan.";
        int maxIndex4 = str5.length()-1;
        System.out.println(maxIndex4);

        String str6 = "Nazerke is my sister, welcome to the USA";
        //             0123456789012345678901234567890123456789    39
        int maxIndex6 = str6.length()-1 ;
        System.out.println(maxIndex6);


        String str7 = "Nazym";
                str7= str7.concat(" Omir");
        System.out.println(str7);


        String str8 = "America is:";
               str8 = str8.concat(" Great country!");
        System.out.println(str8);

        String str9 = "After 6 month";
               str9 =  str9.concat(" i will find job. Inshallah!");
        System.out.println(str9);




    }
}
