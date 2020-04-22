package assigments.old_Assigments;
import java.util.Scanner;
public class assig_56 {
    public static void main(String[] args) {
        double price = 0;


        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();

        System.out.println("Select CPU type:");
        String cpu = scan.next();

        System.out.println("Select RAM size:");
        int ram = scan.nextInt() ;

        System.out.println("Select storage type:");
         String storageType = scan.next();

        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();

        System.out.println("Enter screen resolution:");
        String  screenResolution =scan.next();

        if (screenSize==13.3){
            price +=200;
        }else if (screenSize==15.0){
            price +=300;
        }else if (screenSize==17.3){
            price +=400;
        }

        if (cpu.equals("i3")){
            price +=150;
        }else if (cpu.equals("i5")){
            price +=250;
        }else if (cpu.equals("i7")){
            price += 350;
        }

        price += ram/4  *50;

        if (storageType.equals("SSD")){
            price += (memorySize/500 ) *100;
        }else if (storageType.equals("HDD")){
            price += memorySize/500  *50;
        }

        if (screenResolution.equals("FULLHD")){
            price += 100;
        }else if (screenResolution.equals("4K")){
            price +=200;
        }

        System.out.println("Laptop price is: $"+price);














    }
}
