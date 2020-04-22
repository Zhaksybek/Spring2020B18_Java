package day22_Arrays_Loops;
/*
 write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
 */
public class Java_Pyton {
    public static void main(String[] args) {

        String sentences ="I like java and javascript python python";
        int countJava = 0; //2
        int countPython =0;

               String[] words = sentences.split(" ");//



                 for (String eachWord   :  words    ){
                     if (eachWord.contains("java")){
                         countJava++;
                     }
                     if (eachWord.contains("python")){
                         countPython++;
                     }
                 }
        System.out.println(countJava==countPython); //false



    }
}
