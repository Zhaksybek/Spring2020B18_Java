package day18_nestedLoops;

public class StringRevers {
    public static void main(String[] args) {

        //java
        //0123
        String str = "Java";
        String revers="";

        int lastIndex=str.length()-1;

        do {

            revers += str.charAt(lastIndex);

            lastIndex--;

        }while (lastIndex>=0);
        System.out.println(revers);

    }
}
