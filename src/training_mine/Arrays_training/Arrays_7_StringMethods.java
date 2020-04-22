package training_mine.Arrays_training;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_7_StringMethods {
    public static void main(String[] args) {

        /*
        split(str): splits tje String by the giving value, and returns at as String

        toCharArray():
         */

        String sentences = "Today is great day, Good day to learn java";

             String[] arr = sentences.split(" ");
        System.out.println(Arrays.toString(arr));

        String email = "FirstName_LastName";
               String[] arr2 =  email.split("_");

        System.out.println(Arrays.toString(arr2));

        String fullname = "Abdrasilova Aisulu Kazakhstan";

               String[] array1 = fullname.split(" ");
        System.out.println(Arrays.toString(array1));

        String Java = "I love Java and Java is fun, Java is Life";
                String[] array2 =   Java.split("Java");
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);


        System.out.println("========================================");

        String Python = "Python is good, I love Python, Python is life";
        String[] array3 = Python.split("Python");
        System.out.println(array3.length);


        System.out.println("========================================");


        String emailAddress = "Cybertek.school.batch@gmail.com";
        String fullName = emailAddress.substring(0,emailAddress.indexOf("@"));

        System.out.println(fullName);   //Cybertek_school_batch

                         String[] allName= fullName.split("/.");
        // "/."  dont forget dive ==> "/"
                         System.out.println(Arrays.toString(allName));



        String word = "ABCDEFG";
                String[] newWord = word.split("");
        System.out.println(Arrays.toString(newWord));


        /*
        toCharArray() ==> convert  charArray to String
         */
        String str = "Java";
         char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));




    }
}
