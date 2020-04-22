package assigments.Methods;

public class As_161 {
    public static void main(String[] args) {
       double result = waterTax(151);
        System.out.println(result);
    }

    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if(units<=50){
            bill = units*0.60; //30
        }else if(units>50 && units<=100){
            bill = units*0.90;  //49.5
        }else if(units>=101 && units<=150){
            bill = units*0.90 + 50;
        }if(units>=151){
        bill = units*0.90 + 100;
    }
        //end your code here

        return bill;
    }//end waterTax

}
