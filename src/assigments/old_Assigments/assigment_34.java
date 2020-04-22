package assigments.old_Assigments;
import java.util.Scanner;
public class assigment_34 {
    public static void main(String[] args) {
        int  quaters, dimes, nickels, quatersJ, dimesJ;
         Scanner scan = new Scanner(System.in);

        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();

        if ((itemPrice<25||itemPrice>100)&&(itemPrice%5!=0)){
            System.out.println("Invalid price!");
        }else{
            quaters =itemPrice/25;//3   (++itemPrice)%25
            dimes=(itemPrice-(quaters*25))/10;//2
            nickels=(1+itemPrice) - (quaters*25) -  (itemPrice-(quaters*25));//1
            quatersJ= (1+itemPrice - (quaters*25) -  (itemPrice-(quaters*25)))-nickels;
            dimesJ=(1+itemPrice - (quaters*25) -  (itemPrice-(quaters*25)))-nickels;
            System.out.println("Your change is "+quaters+" quaters "+
                    dimes+ " dimes, and "+nickels+ " nickels.");

            //     quaters%10;//1
        }


    }
}
