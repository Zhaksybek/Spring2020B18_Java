package training_mine.METHODS;

public class Frequency_Mine {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        // expected result: a3b2c4
        //     letters: "abcd"

        String noneDup="";

        for (int i=0; i<str.length(); i++){

            if (!noneDup.contains(str.substring(i,i+1))){
                noneDup += str.substring(i,i+1);
            }
       }
         System.out.println(noneDup);// abc   ==> a3b2c4

        String result = "";



       for (int j=0; j<noneDup.length(); j++) {
           int count = 0;
           for (int i = 0; i < str.length(); i++) {

               if (str.substring(i, i + 1).equals(noneDup.substring(j,j+ 1))) {
                   count++;
               }
           }

           result += noneDup.substring(j,j+1) +count;


       }
        System.out.println(result);

        System.out.println("=====>> 2 ATTEMPT >> ===================================================================");

        String str2 = "KKKZZZZOOOO";  //K3Z4O4
        String nonDup2 = "";


        for (int i=0; i<str2.length();i++){
            if (! nonDup2.contains(str2.substring(i,i+1))){
                nonDup2 += str2.substring(i,i+1);
            }

        }
         System.out.println(nonDup2); // KZO   ==> K3Z4O4

        String result2="";


    for (int j=0; j<nonDup2.length();j++) {
        int count2 = 0;
        for (int i = 0; i < str2.length(); i++) {

            if (str2.substring(i, i + 1).equals(nonDup2.substring(j,j + 1))) {
                count2++;
            }

        }
        result2 += nonDup2.substring(j,j + 1) + count2;
    }

        System.out.println(result2);

        System.out.println("=====>> 3 <> ATTEMPT <> 3 >> ====WITH CharAt Method ====================================");

        String str3 = "AAAAIIKAAA";  // AIK
        String nonDup3 = "";

        for (int i=0; i < str3.length(); i++){

            if (! nonDup3.contains(""+str3.charAt(i))){
                nonDup3 +=str3.charAt(i);
            }

        }

        System.out.println(nonDup3); //AIK


        String finalResult="";

       for (int j=0;j<nonDup3.length();j++) {
           int counnt = 0;
           for (int i = 0; i < str3.length(); i++) {

               if (str3.substring(i, i + 1).equals(nonDup3.substring(j,j + 1))){
                   counnt++;
               }
           }
           finalResult += nonDup3.substring(j,j + 1) + counnt;
         }
        System.out.println(finalResult);








    } // main




} // class
