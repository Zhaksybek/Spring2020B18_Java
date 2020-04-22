package assigments.Methods;
import java.util.Scanner;
public class As_154 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);

        String num1 =""+num;
        String num2="";
        for (int i=num1.length()-1; i>=0;i--){
            num2+=num1.charAt(i);
        }

        if (num1.equals(num2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE


    }



}
