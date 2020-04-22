package day09_Nested_If_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        // trrnary: ?  means if,   :   else

        String result = "";
        if (9 > 10){
            result = " 9 is greater";
        }else {
            result = "10 is greater";
        }
        System.out.println(result);

        String result2 = (9 >10) ?  " 9 is greater" : "10 is greater";
        System.out.println(result2);
        System.out.println("=============================================");

        int age = 21;
         boolean eligibility = (age >=21)? true : false;
        System.out.println(eligibility);

         if (age >= 21 ){
             eligibility=true;
         }eligibility = false;

        System.out.println("=====================================================");

        int  ageOfPerson = 20;
        String eligibleToVote = "";
        if (ageOfPerson>=18){
            eligibleToVote = "YES";
        }else {eligibleToVote = "NO";}

        //System.out.println(eligibility);

        String eligibileToVote2 = (ageOfPerson>=18)? "Yes": "NO";

        System.out.println(eligibileToVote2);
        System.out.println(eligibleToVote);



    }
}
