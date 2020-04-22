package training_mine.FOR_LOOP;

public class Practice13 {
    public static void main(String[] args) {
        String upperCse =""; // A~Z
        String lowercase ="";//a~z

        for (char ch='A'; ch<='Z'; ch++ ){
            upperCse +=ch ;
        }
        System.out.println(upperCse);

        for (char ch = 'a'; ch<='z'; ch++){
            lowercase +=ch ;
        }
        System.out.println(lowercase);

       String result ="";

        for (int i=0; i <= upperCse.length()-1; i++ ){
       result += upperCse.charAt(i) +""+ lowercase.charAt(i) +" ";

        }
        System.out.println(result);


        // second  solution

        int a =97;
        int A = 65;


         String result2 ="";
        for (int i=0; i <26; i++){
                 char ch = (char)(A+i); //65
            char ch2 = (char)(a+i);
             //               97+0

            result2 += ch +"" + ch2+" ";

        }
        System.out.println("Shorter way: "+result2);




    }
}
