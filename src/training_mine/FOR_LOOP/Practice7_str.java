package training_mine.FOR_LOOP;

import java.util.Scanner;

public class Practice7_str {
    public static void main(String[] args) {

        /*
           methods:
                   substring, indexOf, lastIndexOf, replace, replaceFirst,
                   equals, equalIgnorCase, contains, startsWith, endsWith,
                   charAt, trim, lengs, concat, isEmpty, toUpperCase,
                   toLowerCase
         */

        String str = "Cybertek school";

        str = str.substring(0,str.indexOf(" "));

            String str2 = str.substring(str.indexOf(" ")+1,str.length()-1);

        System.out.println(str);
        System.out.println(str2);


        System.out.println("===============================================");

        // replace

        String name = "Cybertek School Batch 18";
          int length = name.length();
        System.out.println(length);
        name = name.replace(" ", "");
        System.out.println(name);

        name=name.replace("e","a");   // replace all e with a
        System.out.println(name);


        //replaceFirst:  replaces the first occured old

        String A1= "Java is Fun, Java is object oriented, Java is cool";
        A1 = A1.replace("Java is o", "C++ is o");
        A1 =A1.replace("d, Java", "d, C#");
        System.out.println(A1);


        /*

         == , equals, equalsIgnorCase
         */

        String R1 = "Cybertek"; // String pool
        String R2 = new String("Cybertek"); // heap

        String R3 = new String("cybertek"); // heap

        System.out.println(R1==R2); // false
        System.out.println(R1.equals(R2)); // true

        System.out.println(R1.equals(R3));//false, CASE sensetive

        System.out.println(R1.equalsIgnoreCase(R3));
        //true, it check the visible text without case sensetivity

        /*
        trim
         */

        //charAt();

        String C1 = "Cybertek";
        //           01234567

        char ch = C1.charAt(4);
        System.out.println(ch);


        String C2 = "Please do more and more java practice tomorrow";
        char ch2 = C2.charAt(C2.lastIndexOf("w"));
        System.out.println(ch2);


        String sentences = "ABCDEFGKLMN";
        System.out.println(sentences.charAt(0)+""+sentences.charAt(sentences.length()-1));

       // startsWith &  endWith :     boolean returns, checks the starting and

        String Gmail = "cybertekSchool@gmail.com";
               boolean R = Gmail.endsWith("@gmail.com");
        System.out.println(R);

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your email address");

        String GmailAddress = scan.nextLine().toLowerCase() ;
                GmailAddress="jake@gmail.com";

        if (GmailAddress.endsWith("@gmail.com")){
            System.out.println("Valid  gmail address is "+GmailAddress);

        }else {
            System.out.println("Ivalid gmail; address");
        }


        // starts with www.


        System.out.println("Enter a web Address");
        String URL = scan.nextLine().toLowerCase();

        if (URL.startsWith("www") && URL.endsWith(".com")){
            System.out.println("its valid web address");
        }else {
            System.out.println("its invalid web address");
        }

        // contains: checks if the given value is contained in the String
        // or not then returns boolean
        String salary = "1000$";
                  boolean result2 =   salary.contains("$");// true
        System.out.println(result2);


        // concate: concates two String values:

        String SchoolName ="Cybertek";
          SchoolName = SchoolName.concat("School");
        System.out.println(SchoolName);










    }
}
