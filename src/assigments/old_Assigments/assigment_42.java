package assigments.old_Assigments;

public class assigment_42 {
    public static void main(String[] args) {

        int vehicleYear = 2020;
        boolean recall =(vehicleYear>=1995||vehicleYear<=1998);
        boolean recall2=(vehicleYear>=2001||vehicleYear<=2002);
        boolean recall3=(vehicleYear>=2004||vehicleYear<=2006);
        boolean recall4=(vehicleYear>=2015||vehicleYear<=2017);

        System.out.println("Enter vehicle's year:");
        System.out.println(vehicleYear);


        if (recall){
            System.out.println("Your vihicle needs to be recalled!");
        }else if(recall2){
            System.out.println("Your vihicle needs to be recalled!");
        }else if (recall3){
            System.out.println("Your vihicle needs to be recalled!");
        }else if(recall4){System.out.println("Your vihicle needs to be recalled!");
        }else {
            System.out.println("Your vehicle is fine, enjoy");
        }


    }
}
