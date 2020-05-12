package assigments.As_05_07_2020;

import java.util.Scanner;

public class Time_Conversion {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //timeConversion(scan.nextLine());
        String s = "11:25:15PM";

        if (s.equals("12:00:00AM")){
            System.out.println("00:00:00");
        }else if (s.equals("12:00:00PM")){
            System.out.println("12:00:00");
        }else if (s.endsWith("AM")){

            System.out.println(s.substring(0,s.length()-2));
        }else if (s.endsWith("PM")){
            if (s.length()==9){
                int a1 = Integer.parseInt(s.substring(0,1))+12;
                System.out.println(""+a1+s.substring(1,s.length()-2));
            }else {
                int a1 = Integer.parseInt(s.substring(0, 2)) + 12;
                System.out.println("" + a1 + s.substring(2, s.length() - 2));
            }
        }


       // System.out.println(a1);


    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */


    }



}
