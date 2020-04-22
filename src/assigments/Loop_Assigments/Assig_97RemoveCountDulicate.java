package assigments.Loop_Assigments;

import java.util.Scanner;

public class Assig_97RemoveCountDulicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

       int countJava = 0;
       int countPyton = 0;

       if (!sentence.contains("java") && !sentence.contains("python") ){
            System.out.println(true);
            System.exit(0);
        }

       while (sentence.contains("java")){
       countJava++;
       sentence =sentence.replaceFirst("java","");



       }

        while (sentence.contains("python")){
            countPyton++;
            sentence=sentence.replaceFirst("python","");
        }

        if (countJava==countPyton){
            System.out.println("true");
        }else if ( countJava!=countPyton){
            System.out.println("false");
        }

        /*
        "Java is a general-purpose computer-programming language that is concurrent,
        class-based, object-oriented,[15] and specifically designed to have as few implementation
        dependencies as possible."

        java is a multi-platform language
        String str ="Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.";

         */




    }
}
