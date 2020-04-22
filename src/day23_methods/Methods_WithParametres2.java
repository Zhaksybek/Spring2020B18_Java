package day23_methods;

public class Methods_WithParametres2 {
    public static void main(String[] args) {
       String names="Zhaksybek";
       ReversString(names);

        System.out.println("Hello world");
        String name2= "America is Great country";
        ReversString(name2);

    }

    public  static void ReversString(String str){

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }


}//CLASS don't touch
