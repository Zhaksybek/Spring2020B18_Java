package assigments.UP_TO_LOOP;
import java.util.Scanner;
public class assig_80 {
    public static void main(String[] args) {
      Scanner s =new Scanner(System.in);
        double weight = 0;
        double cal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weightInPownd= s.nextDouble();
        weight = weightInPownd/2.2;

        //cal = 0.0175 * MET * Weight in kilograms
        cal =0.0175*10*30*weight  +(0.0175*8*30*weight)+(0.0175*360*weight);
        System.out.println((int) cal);






    }
}







