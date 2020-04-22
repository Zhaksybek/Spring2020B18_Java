package assigments.ArraysClassAssigments;
import java.util.Scanner;
public class As_3_1CarFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;


        if (model.equals("Extravagant")){
                  if (year>=2010 && year<=2012){
                      System.out.println(!recalled);//true
                  }else {
                      System.out.println(recalled); //false
                  }


        }else if (model.equals("Guzzler")){
               if (year>=2015 && year<=2018){
                   System.out.println(!recalled);
               }else {
                   System.out.println(recalled);
               }


        }




    }
}
