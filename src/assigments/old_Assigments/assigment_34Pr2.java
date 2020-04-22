package assigments.old_Assigments;

import java.util.Scanner;

public class assigment_34Pr2 {
    public static void main(String[] args) {

        int quaters, dimes, nickels, quatersJ, dimesJ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();

        if ((itemPrice<25||itemPrice>100)&&(itemPrice%5!=0)){
            System.out.println("Invalid price!");
        }else// if(itemPrice==55)
        {
            quaters = (100 - itemPrice) / 25;//(100-55)/25=45/25==>1 quaters 20 cent
            dimes = (100 - itemPrice -(quaters*25)) / 10;  // ==>2
            nickels = (100-itemPrice-(quaters*25)-(10*dimes)) / 5;
            System.out.println("Your change is " + quaters + " quarters, " +
                    dimes + " dimes, and " + nickels + " nickels.");

        }  /*else {
            quaters = (100 - itemPrice) / 25;
            dimes = (100 - itemPrice) / 10;
            nickels = (100 - itemPrice) / 5;

            System.out.println("Your change is " + quaters + " quarters, " +
                    dimes + " dimes, and " + nickels + " nickels.");
        }*/



/*
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();

        if ((itemPrice < 25 || itemPrice > 100) && (itemPrice % 5 != 0)) {
            System.out.println("Invalid price!");
        } else {
            quaters = (100 - itemPrice) / 25;
            dimes = (100 - quaters) / 10;
            nickels = (100 - dimes) / 5;

            System.out.println("Your change is " + quaters + " quaters " +
                    dimes + " dimes, and " + nickels + " nickels.");



       -----------------------------------------------------------------
                    else if(itemPrice==55)
        {
              quaters = (100 - itemPrice) / 25;//(100-55)/25=45/25==>1 quaters 20 cent
              dimes = ((100 - itemPrice)%25) / 10;  // ==>2
              nickels = (dimes) % 5;
              System.out.println("Your change is " + quaters + " quarters, " +
                    dimes + " dimes, and " + nickels + " nickels.");

        }
-----------------------------------------------------------------

        }*/





    }}
