package assigments.UP_TO_LOOP;
import java.util.Scanner;
public class assig_78 {
    public static void main(String[] args) {


        double premium = 0;

        String referenceNumber = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        String name = scan.nextLine(); //NAME

        System.out.println("Do you have a US driver license?");//LICENCE
        String DVLicenceHaneNOYES=scan.next();
        if (DVLicenceHaneNOYES.equalsIgnoreCase("No")){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode =scan.nextInt();
        if (zipCode==20910 || zipCode==20740){
            premium +=60;

        }else if (zipCode==22102 || zipCode==22103){
            premium +=30;
        }else {
            premium +=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("owned")){
            premium +=10;

        }else {
            premium +=20;
        }

        System.out.println("How is this vehicle primarily used?");
        String vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Commute")){
            premium +=20;
            System.out.println("Days Driven To Work And/Or School");
            int daysDrivenToWorkOrSchool = scan.nextInt();
            premium += 5*daysDrivenToWorkOrSchool;

            System.out.println("Miles Driven To Work And/Or School");
            int milesToWorkOrSchool = scan.nextInt();
            premium +=milesToWorkOrSchool;

            }else if (vehicleUsage.equalsIgnoreCase("Business")){
            premium +=50;//120

        }else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium +=10;//70
        }


        System.out.println("How old are you?");
        byte age = scan.nextByte();
        if (age<16){
            System.out.println("Invalid data!");
            System.exit( 0);
        }else if (age>=16 && age<18){
            premium *=20;
        }else if (age>=18 && age<=21){
            premium *=6;
        }else if (age>21 && age<25){
            premium *=2;
        }



        System.out.println("How many years you've been driving?");
        int drivingExperience = scan.nextInt();

        if (drivingExperience<=0 && (age-drivingExperience)<=16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else {
            premium -=5*drivingExperience;

        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String accidentHaveYesNo =scan.next();
        if (accidentHaveYesNo.equalsIgnoreCase("Yes")){
            System.out.println("How many?");
            int accidentsAmount = scan.nextInt();
            premium = premium + (premium*0.2)*accidentsAmount;


        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        String continuousInsurance = scan.next(); //yes or no
        if (continuousInsurance.equals("No")){
            premium *=2;

        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String education = scan.nextLine();
        if (education.equals("PhD") ){
            premium -= (premium*0.05);
        } else if (education.equals("Bachelors")){
            premium -=  (premium*0.05); //79.8

        }else if (education.equals("Masters")){
            premium -= (premium*0.05);
        }else if (education.equals("Doctors")){
            premium -= premium*0.1;
        }else if (education.equals("Less than High School")){
            premium += premium*0.05;


        }

        if (name.length()-1<4){
            referenceNumber=name.substring(0,2).concat(age+"") + name.substring(1)+zipCode+
                    education.replace(" ", "");

        }else {

                referenceNumber = name.substring(0, 2).concat(age + "") + name.substring(name.length() - 2) + zipCode +
                        education.replace(" ", "");
            }


        System.out.println( name+ ", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        System.out.println("Reference number: "+referenceNumber.toUpperCase());



















    }
}
