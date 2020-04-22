package assigments.old_Assigments;
import java.util.Scanner;
public class assig35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter items name:");

        String item = scan.nextLine();

        String result = (item.equals("Smartphone")&&item.equals("Laptop"))?"Sorry, not enough funds on your gift card!"
                :(item.equals("Charger"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 85$")

                :(item.equals("USB cable"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 90$")

                :(item.equals("Headphones"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 70$")

                :(item.equals("Pants"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 50$")
                :(item.equals("Hat"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 75$")
                :(item.equals("Socks"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 95$")
                :(item.equals("Blanket"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 40$")
                :(item.equals("Pillow"))?("Thank you for your purchase!" + "\n"+"Your current balance is: 60$")
                :"Invalid item!";

        System.out.println( result);






    }
}
