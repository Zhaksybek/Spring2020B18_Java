package assigments.old_Assigments;

import java.util.Scanner;

public class assig_51 {
    public static void main(String[] args) {
/*

         Poor = 5%
         Fair = 10%
         Good = 15%
         Great = 20%
         Excellent = 25%

          Input:
        Split:Yes
        Number of people:4
        Check amount:476.0
        Service Quality:Excellent

         Output:
        Number of people entered: &&&&
        Total to pay: 595.0
        Total tip: 119.0
        Total per person: 148.75
        Tip per person: 29.75
         */
        Scanner scan = new Scanner(System.in);

        double Excell=0.25 , Great = 0.2, Good = 0.15, Fair = 0.10, Poor = 0.05;


        System.out.println("Split:"); // Yes or NO
        String split = scan.next();

        if (split.equals("Yes")){
            System.out.println("Number of people:");
          byte  NumberOfPeople =scan.nextByte(); //5
            System.out.println("Check amount:"); //500.0
           double checkAmount = scan.nextDouble();
            System.out.println("Service Quality:");
            String ServiceQuality =scan.next(); //Excellent

            double ExTip =checkAmount*Excell;
            double GreTip = checkAmount*Great;
            double GooTip = checkAmount*Good;
            double FaiTip = checkAmount*Fair;
            double PoorTip = checkAmount*Poor;


            double Tips = (ServiceQuality.equals("Excellent"))?ExTip:(ServiceQuality.equals("Great"))?GreTip
                    :(ServiceQuality.equals("Good"))?GooTip:(ServiceQuality.equals("Fair"))?FaiTip :PoorTip;

            String NumOfPeoOICTURE = (NumberOfPeople==1)?"&":(NumberOfPeople==2)?"&&"
                    :(NumberOfPeople==3)?"&&&":(NumberOfPeople==4)?"&&&&"
                    :(NumberOfPeople==5)?"&&&&&":(NumberOfPeople==6)?"&&&&&"
                    :(NumberOfPeople==7)?"&&&&&&&":(NumberOfPeople==8)?"&&&&&&&&":(NumberOfPeople==9)?"&&&&&&&&&"
                    :"&&&&&&&&&&";

            double totalPay = checkAmount + Tips;
            double totalPerPerson = totalPay/NumberOfPeople;
            double tipPerPerson = Tips/NumberOfPeople;

            System.out.println("Number of people entered: " +NumOfPeoOICTURE);
            System.out.println("Total to pay: "+totalPay);
            System.out.println("Total tip: " + Tips);
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);




        } else if (split.equals("No")){

            byte  NumberOfPeople = 1 ; //4
            System.out.println("Check amount:"); //476.0
            double checkAmount = scan.nextDouble();
            System.out.println("Service Quality:");
            String ServiceQuality =scan.next(); //Excellent


            double ExTip =checkAmount*Excell;
            double GreTip = checkAmount*Great;
            double GooTip = checkAmount*Good;
            double FaiTip = checkAmount*Fair;
            double PoorTip = checkAmount*Poor;

            double Tips = (ServiceQuality.equals("Excellent"))?ExTip:(ServiceQuality.equals("Great"))?GreTip
                    :(ServiceQuality.equals("Good"))?GooTip:(ServiceQuality.equals("Fair"))?FaiTip:PoorTip;

            String NumOfPeoOICTURE = "&";
            double totalPay = checkAmount + Tips;

            System.out.println("Number of people entered: " +NumOfPeoOICTURE);
            System.out.println("Total to pay: "+totalPay);
            System.out.println("Total tip: " + Tips);


        }






    }
}
