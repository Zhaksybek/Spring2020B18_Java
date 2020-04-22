package assigments.old_Assigments;
import java.util.Scanner;
public class assigment_46 {
    public static void main(String[] args) {
        //int num, digit1, digit2, digit3, digit4, digit5;
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your number");
        int digit1, digit2, digit3, digit4, digit5;
        int num  = scan.nextInt(); //45678
        digit1= num/10000;  // 4
        digit2 = (num%10000)/1000; // digit2 = (4.5678==>5678)/10000= 5(int)
        digit3 = (num%1000)/100;   // digit3 = (45.678==>678)/100 = 6(int)
        digit4 = (num%100)/10;     //digit4 = (456.78==>78)/10 = 7 (int)
        digit5 = (num%10)/1;       //digit5 = (4567.8)/1  = 8

        System.out.println("Display prompt: "+digit1);
        System.out.println("Display prompt: "+digit2);
        System.out.println("Display prompt: "+digit3);
        System.out.println("Display prompt: "+digit4);
        System.out.println("Display prompt: "+digit5);




    }
}
