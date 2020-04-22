package day010_Switch_Scanner;
/*
2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
 */
public class days {
    public static void main(String[] args) {
        int num = 3;
        String result = "";

        String result2 = "";


        if (num >=1 && num <=7) {

           result2 =(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednasday"
                   :(num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday": "Sunday";
        }else {
            result2 = "Invalid";
        }

        System.out.println(result2);


/*
        if (num >=1 && num <=7){
            if (num==1){
                result = "Monday";
            }else if (num==2){
                result = "Tuesday";
            }else if (num==3){
                result = "Wednasday";
            }else if (num==4){
                result = "Thursday";
            }else if (num==5){
                result="Friday";
            }else if (num==6){
                result = "Saturday";
            }else {
                result ="Sunday";
            }

            //result = (num==1)? "Monday":

                }else {
            result = "Invalid";
        }

        System.out.println(result);
        */



        }



    }

