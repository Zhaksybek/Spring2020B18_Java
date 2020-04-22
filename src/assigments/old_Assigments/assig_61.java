package assigments.old_Assigments;
import java.util.Scanner;
public class assig_61 {
    public static void main(String[] args) {

        int propertyPrice = 0;
        //;


        //String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        System.out.println(" Enter your property type:");//house TYPE
        String houseType = scan.nextLine();

        System.out.println("How many bedrooms do you have?"); // NUM
        int numberOfBedrooms = scan.nextInt();

        System.out.println("Do you have a backyard?");// TRUE/FALSE
          boolean backyard =scan.nextBoolean();

        if ( houseType.equals("Condo") && backyard==true){
            System.out.println("Backyard is not available for condo!");
        }

        System.out.println("Do you have garage?");// TRUE/FALSE
        boolean  garage = scan.nextBoolean();



        System.out.println("How many spots?");
        int  garageSpots = scan.nextInt();

        if (garage==true &&  garageSpots>10){
            System.out.println("Pardon,  it's not a public parking!");
        }

        System.out.println("How close is metro station?");
        float metroAccessibility=scan.nextFloat();

        System.out.println("How close is highway?");
        float highwayAccessibility = scan.nextFloat();

        System.out.println("What's the rating of nearest school?");
        float  schoolScore=scan.nextFloat();

        System.out.println("Does any of your family members smoking?");
        boolean  smoking = scan.nextBoolean();

        //System.out.println("Market report has been generated.");
      //  System.out.println("Your estimate market price is:");



        if (houseType.equalsIgnoreCase("Condo")){
            propertyPrice =50000;
            propertyPrice += 30000*numberOfBedrooms;


            //garage

            if (garage==true&&garageSpots>10){
                System.out.println(" Pardon,  it's not a public parking!" );

            }else {propertyPrice += 20000*garageSpots;}


           //metro
            if (metroAccessibility<=1 && metroAccessibility>0){
                propertyPrice += 10000;

            }else if (metroAccessibility>1 && metroAccessibility<=3){
                propertyPrice += 5000;
            }

            //highway
            if (highwayAccessibility<=1 && highwayAccessibility>0){
                propertyPrice +=15000;
            }else  if (highwayAccessibility>1 && highwayAccessibility<5){
                propertyPrice += 8000;
            }else if (highwayAccessibility>=5 && highwayAccessibility<=20){
                propertyPrice += 4000;
            }


            //school
            if (schoolScore<=10 && schoolScore>=8){
                propertyPrice +=45000;
            }else if (schoolScore<8 && schoolScore>=4){
                propertyPrice += 20000;
            }else { propertyPrice += 5000;}


            //smoke
            if (smoking==true){
                propertyPrice  -=5000;
            }

            //System.out.println("Market report has been generated.");
         //   System.out.println("Your estimate market price is: "+propertyPrice + "$");



             //main second
        } else if(houseType.equals("Townhouse") || houseType.equals("Single Family Home") ) {

            if (houseType.equals("Townhouse")){
                propertyPrice = 75000;
            }else  if (houseType.equals("Single Family Home")){
                propertyPrice = 95000;
            }


            propertyPrice += 30000*numberOfBedrooms;

            if (backyard==true){
                propertyPrice += 5000;
            }




             if (garage==true && garageSpots<10){
                propertyPrice += garageSpots*20000;
            }

            //metro
            if (metroAccessibility<=1 && metroAccessibility>0){
                propertyPrice += 10000;

            }else if (metroAccessibility>1 && metroAccessibility<=3){
                propertyPrice += 5000;
            }

            //highway
            if (highwayAccessibility<=1 && highwayAccessibility>0){
                propertyPrice +=15000;
            }else  if (highwayAccessibility>1 && highwayAccessibility<5){
                propertyPrice += 8000;
            }else if (highwayAccessibility>=5 && highwayAccessibility<=20){
                propertyPrice += 4000;
            }


            //school
            if (schoolScore<=10 && schoolScore>=8){
                propertyPrice +=45000;
            }else if (schoolScore<8 && schoolScore>=4){
                propertyPrice += 20000;
            }else { propertyPrice += 5000;}


            //smoke
            if (smoking==true){
                propertyPrice  -=5000;
            }


        } // main else }


        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+ propertyPrice + "$" );






    }
}
