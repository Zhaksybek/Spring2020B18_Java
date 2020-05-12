package training_mine.PizzaDelivery;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer_m {

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setInfo(String location, String company, double salary, boolean isFullTime){
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFullTime=isFullTime;


    }
    public String toString(){
        return "Location: "+location+", Company: "+company+", Salary: $"+salary+", FullTime: "+isFullTime;
    }

}

class offerObjects{

    public static void main(String[] args) {

        Offer_m offer1 =new Offer_m();
        offer1.setInfo("CA","Google",130_000,true);

        Offer_m offer2 =new Offer_m();
        offer2.setInfo("Arizona","Geico",110_000,true);

        Offer_m offer3 =new Offer_m();
        offer3.setInfo("LA","Medical Health",140_000,false);

        Offer_m offer4 =new Offer_m();
        offer4.setInfo("Chicago","Insurance",95_000,false);

        Offer_m[] offers = {offer1,offer2,offer3,offer4};

        ArrayList<Offer_m> Accept = new ArrayList<>(Arrays.asList(offers));
          Accept.removeIf(p -> p.salary < 100_000 || p.isFullTime == false);
          // we remove the offer if it;s salary <100 000  or if it's not full time


        for (int i=0; i<Accept.size(); i++){


            System.out.println(Accept.get(i));
        }







    }
}
