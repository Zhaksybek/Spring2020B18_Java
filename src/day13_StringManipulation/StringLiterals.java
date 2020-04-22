package day13_StringManipulation;

public class StringLiterals {
    public static void main(String[] args) {

        String str1 = "Cat";
        String str2 = new String("Cat");
        System.out.println(str1+" : " +str2);

        System.out.println(str1 == str2);// false

        String str3 ="Cat"; // String pool

        System.out.println(str1== str3); //true

        String str4 = new String("Cat");
        System.out.println("str2 == str4: " + str2 == str4);

        String s = "Java";
        s = "JavaScript";  // re assigned

        String s2 = "New Java";

        System.out.println(s==s2);

        String d = "Jackson";
        d = "Jake";
        d = "Jackson";
        System.out.println(d);


    }
}
