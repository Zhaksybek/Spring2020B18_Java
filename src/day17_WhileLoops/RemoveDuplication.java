package day17_WhileLoops;

public class RemoveDuplication {
    public static void main(String[] args) {

        String str ="Java Java Java is fun, Java is cool"; //


        int count =0;
        while (str.contains("Java")){

            count++;
            str = str.replaceFirst("Java","" );   // after counting first "Java"

        }
        System.out.println(count);


    }
}
