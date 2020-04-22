package training_mine.Old_training;
import java.util.Scanner;
public class switchcase_2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter car Mark");

        String carMark =scan.next();
        String AboutCar ="";

        switch (carMark){

            case "Toyota":
                AboutCar= "Toyota is good car";
            break;

            case "Lexus":
                AboutCar="Lexus is lucshury car";
                break;

            case "Zaparojes":
                AboutCar="ZP is too old Russian car";
                break;

            case "Nissan":
                AboutCar="Nissan is car for Uber and Lyft";
                 break;

            default:
                AboutCar=("Sorry we don't have car like this:" +carMark);
            break;


        }
        System.out.println(AboutCar);






    }
}




