package training_mine.FOR_LOOP;
import java.util.Scanner;
public class TaskLoop {
    public static void main(String[] args) {
        /*
        Task01:

         */

    /*    for (int i = 1; i <= 10; i +=2){
            System.out.println("Hello World "+i);
        }   */

        /*
        Task to  1~32  all even numbers
         */

        for (int i =1; i <=32; i++){
            if (i % 2 ==0) {
                System.out.print(i+" ");
            }
        }

        // task 3: 1~32 odd numbers

        for (int i =1; i <=32; i++){
            if (i % 2 ==0){
                System.out.println(i+" ");
            }
        }
        System.out.println("====================================");


        //            0123
        //           "avaJ"

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String str = scan.nextLine();
        String Rev = "" +str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        //System.out.println(Rev);//manual

        String Rev2 = "";

        for (int i =str.length()-1; i >= 0; i--){
            Rev2 += str.charAt(i);
        }
        System.out.println(Rev2);






        System.out.println("====================================");


    }
}
