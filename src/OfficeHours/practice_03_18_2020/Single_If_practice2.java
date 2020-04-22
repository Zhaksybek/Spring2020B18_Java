package OfficeHours.practice_03_18_2020;

public class Single_If_practice2 {
    public static void main(String[] args) {

        byte age = 20;
        boolean eligibleToBuy = age > 21 || age == 21; // age>= 21

        if(age>=21){
            System.out.println("Here is your Vodka");
        }
        if(!eligibleToBuy) {
            System.out.println("Go drink your milk");
        }

        boolean feeling = false;

        if (feeling == false){
            System.out.println("Don't be sad");
        }
        if (feeling == true){
            System.out.println("Stay happy");
        }




    }
}
