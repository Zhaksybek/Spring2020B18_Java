package training_mine.METHODS;

public class FrequencyMethod {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        // expected result: a3b2c4
             //     letters: "abcd"

        String RemoveDup = ""; // to store the non duplicated values of the str

        for ( int i=0; i< str.length(); i++){
            if (!RemoveDup.contains(str.substring(i,i+1))){
                RemoveDup += str.substring(i,i+1);
            }
        }
        System.out.println(RemoveDup);

        //abc  READY

        // next Step is ==>:   result =  a3b2c4

        String result ="";  // to store the expected result


    for (int j=0; j < RemoveDup.length(); j++ ) { //step #3
        int count =0;   // count the numbers of apperances
        for (int i = 0; i < str.length(); i++) { //step #2
            if (str.substring(i, i + 1).equals(RemoveDup.substring(j,j+1))) {
                count++;
            }
        }

        result += RemoveDup.substring(j,j+1) + count;
    }
        System.out.println(result );


        System.out.println("========<< SOLUTION #2 >>==========================<< SOLUTION #2 >>=====================");

        String input = "XXXYYZZZ";
        // result: X3Y2Z3
        //         letters: "XYZ"


        String nonDup ="";  //  remove dup and  store it ==> "XYZ"

        for (int i=0; i < input.length(); i++){
            if (! nonDup.contains(""+input.charAt(i))){
                nonDup += input.charAt(i);  //"XYZ"
            }
        }
        System.out.println(nonDup);


        String expectedResult ="";

     for (int j=0; j<nonDup.length(); j++) {
         int times = 0;  //count the occurence of X
         for (int i = 0; i < input.length(); i++) {
             if (input.charAt(i)==nonDup.charAt(j)) {
                 times++;
             }
         }
         expectedResult += nonDup.charAt(j) + times;
     }

        System.out.println(expectedResult);





    }
}
