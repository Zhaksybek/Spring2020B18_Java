package assigments.old_Assigments;
import java.util.Scanner;
public class assigment_34VIDEOGAME {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Number of coupons:");
        int numCoupons = scan.nextInt();

        int candy = numCoupons/10;//7
        int gim = (numCoupons%10)/3;

        if (numCoupons<3){
            System.out.println("Not enough coupons");
        }else {
            System.out.println("Number of Candies: " + candy);
            if (numCoupons%10==3){
                System.out.println("Number of Gumballs: 1");
            }else {
            System.out.println("Number of Gumballs: " + gim);
            }
        }


    }
}
