package training_mine.METHODS;

public class Method_practice2 {
    public static void main(String[] args) {


        RemoveDuplicates("DFDFFDFDFFFSFFSFSFSFSFDFDFSFS");



    }



 public static void RemoveDuplicates(String str){

       String result="";

        for (int i=0; i<str.length();i++){

            if (!result.contains(str.substring(i,i+1))){
                result +=str.substring(i,i+1);
            }

        }
     System.out.println(result);

 }


}//don't touch