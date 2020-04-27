package day20_Arrays_Continue;

public class As_186 {
    public static void main(String[] args) {
      String s ="aa2aa3";
      String result = "0123456789";


        for (int i=0; i <s.length(); i++){

            if (result.contains(""+s.charAt(i))){
                result += s.charAt(i);
            }
        }
       // System.out.println(result.substring(10));
        System.out.println("=========================================");

        System.out.println(extractNum("aa!!%$#.10aa"));


        }
    public static String extractNum(String s) {
        String result = "0123456789";

        for (int i=0; i <s.length(); i++){

            if (result.contains(""+s.charAt(i))){
                result += s.charAt(i);
            }
        }
       return result.substring(10);

    }




      }





