package day14_StringClass;

public class stringManipulation2 {
    public static void main(String[] args) {

        String str = "";
              boolean bool1 = str.isEmpty(); // true
        System.out.println(bool1);

        String username = "";

        if (username.isEmpty()){
            System.out.println("Please provide the user name first");
        }


        String s1 = "Cat";
        String s2 = new String("Cat");

        System.out.println(s1 == s2); // false, different memory locations, different objects

        System.out.println(  s1.equals(s2)  );  //true



        String z1 = "Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";

        System.out.println(   z1.equals(z2)  );


        /*
        userName:  cybertek
        passWord:  cybertekshool
         */







    }
}
