package day12_JavaRecap;
import  java.util.Scanner;
public class Ternary_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter status code: ");
        int satusCode = scan.nextInt();

        String result = "";

        if (satusCode==200){
            result ="OK";
        }else if (satusCode==201){
            result ="Created";
        }else if (satusCode==202){
            result = "Accepted";
        }else {
            System.out.println("Invalid status code");
        }


        System.out.println("======================================");
        String result2 = (satusCode==200)?"OK":(satusCode==201)?"Created"
                :(satusCode==202)?"Accepted":"Invalid status code";
        System.out.println(result2);



    }
}
