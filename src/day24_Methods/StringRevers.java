package day24_Methods;

public class StringRevers {
    public static void main(String[] args) {
      //String t =  Revers("Cybertek");

        String name =  Revers2("Aiman");
        System.out.println(name);


    }//main


    public static void Revers(String str){
        String Revers="";

        for (int i=str.length()-1; i>=0; i--){
                     Revers += str.charAt(i);

        }
        System.out.println(Revers);
    }//revers


    public static String Revers2(String str){
        String Revers="";

        for (int i=str.length()-1; i>=0; i--){
            Revers += str.charAt(i);

        }
        return Revers;


    }



}//class
