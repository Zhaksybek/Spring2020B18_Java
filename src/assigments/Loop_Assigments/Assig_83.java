package assigments.Loop_Assigments;

import java.util.Scanner;

public class Assig_83 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String guestName =input.next();
        String result =guestName+", ";

        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();
         int count =1;
        while (answer.equalsIgnoreCase("Yes")){
            count++;
            System.out.println("Please enter guest name:");
            guestName =input.next();
            if(count>=2){

             result += ((count>2) && answer.equals("no"))? guestName:guestName+", ";
                    //result += guestName;

            }else {
                result += guestName;
            }

            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
            if (answer.equalsIgnoreCase("No")){
                break;
            }
        }

        System.out.println("Guest's list: "+result.substring(0,result.length()-2));




    }
}
