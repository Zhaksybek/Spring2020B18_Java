package day13_StringManipulation;

public class strManup_trMine3 {
    public static void main(String[] args) {

        String str = "        When i was at school, i was too shy kid.      ";
                str = str.trim();
        System.out.println(str);

        String tr = "   Call your teacher his first name   ";
               tr = tr.concat(", thats very funny                    ");
        tr = tr.trim();
        System.out.println(tr);


        String str2 = "Cybertek School is the best";
        //            012345678
        String schoolName = str2.substring(0,8);

        System.out.println(schoolName);


        String str3 = "My major goal is to be senior developer in Google Company";
                    // 01234567890123456789
        String str4 = str3.substring(3, 8);
        System.out.println(str4);

        String stars = "Michael Jackson";
         //             012345678901234
        String firstName = stars.substring(0,7);
        String lastName  = stars.substring(8, 14+1);

        System.out.println("First name is: "+firstName);
        System.out.println("Last name is: "+lastName);

        String biv = "Malika Ilyasova";
                   // 012345678901234
        String herFirtsName = biv.substring(0,6);
        String herLastName = biv.substring(7, 14+1);

        System.out.println(herFirtsName);
        System.out.println(herLastName);

        // String gmail = lastName2.concat("_").concat(firsName2).concat("@gmail.com");
        //Ilyasova_malica98@gmail.com

        String gmail =  (herLastName.concat("_").concat(herFirtsName).concat("98@gmail.com"));
                gmail = gmail.toLowerCase();
        System.out.println(gmail);


        String me = "Mister Jackson";
                  // 01234567890123
        String firstNameMe = me.substring(0,6);
        String lastNameMe   = me.substring(7,13+1);
        //JACKSON.MISTER93@gmail.com
        String gmailForMe = lastNameMe.concat(".").concat(firstNameMe).concat("93@gmail.com");
               gmailForMe = gmailForMe.toLowerCase();
        System.out.println(gmailForMe);

        String s1 = "I love Java Programming language";
        //           0123456789
        String className = s1.substring(12);
        System.out.println(className);


        String newRep = "My first love was Malica ";
                newRep= newRep.replace("Malica", "Aizhan");

        System.out.println(newRep);


        String newRep2 = "I am living in Texas Austin";
                newRep2 = newRep2.replace("Texas Austin","California SSF");
        System.out.println(newRep2);


        String newRepF = "Your first cam was Canon 6d or Canon mark IV";
               newRepF = newRepF.replaceFirst("Canon", "Sony");
        System.out.println(newRepF);


        String Str = "I like Java programming Jake";
        int num1 = Str.indexOf("Jake"); // 24
        System.out.println(num1);







    }
}
