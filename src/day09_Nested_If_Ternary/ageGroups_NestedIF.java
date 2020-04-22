package day09_Nested_If_Ternary;

public class ageGroups_NestedIF {
    public static void main(String[] args) {
        /*
        write aprogram that can define the age groups of a person
        age groups are:
        Teenager (<21)
        Adult(>=21 && <55)
        Senior (>55)
        age cannot be negative or greater than 150
        * */


        int age = 27;
        String ageGroup = "";

        if(age < 150 && age >0){
            if (age < 21) {
                ageGroup = "Teenager";
                } else if (age < 55){ // age is alredy greater or equal yo 21
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }

        }else {
            ageGroup = "Invalid Entry";
        }
        System.out.println(ageGroup); //Adult

        int age2 = 45;
        String ageGroup2 ="";

        if (age2 < 150 && age2 >0){

            ageGroup2 =(age2 < 21)? "Teenager" : (age2 < 55)? "Adult" : "Senior";

        }else {ageGroup2 = "Invalid Entry";}



        /*
        if()

        if (age<=3 && age>0){
            ageGroup = "Baby";
        }else if (age>=3 && age <=5){
            ageGroup ="Toddler";
        }else if (age >= 6 && age <= 9){
            ageGroup = "Kid";
        }else if (age>=10 && age <=12) {
            ageGroup = "pre-teen";
        }else if (age>=13 && age <=17){
            ageGroup ="Teenager";
        }else if (age>=18 && age <=20){
            ageGroup ="Young Adult";
        }else if (age >=21 && age <=39){
            ageGroup = "Adult";
        }else  if (age>=40 && age <=49){
            ageGroup = "Young Middle-Aged Adult";
        }else if (age>= 50 && age <= 54){
            ageGroup = "Middle-Aged Adult";
        }else if(age>=55 && age<=64){
            ageGroup = " Very Young Senior Citizen";
        }else if (age>=65 && age<=75){
            ageGroup="Young Senior Citizen";
        }else if (age>=75 && age <=84){
            ageGroup = "Senior Citizen";
        }else if (age>=85 && age <=150){
            ageGroup =" Old Senior Citizen";
        }else {
            ageGroup="Invalid entry";
        }

        System.out.println(ageGroup);
*/



    }
}
