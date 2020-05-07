package day35_Static;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("CA","BOA",100_000,true);

        Offer offer2 = new Offer();
        offer2.setInfo("TX","CapitalOne",120_000,false);

        Offer offer3 = new Offer();
        offer3.setInfo("BayArea","Google",115_000,true);

        Offer offer4 = new Offer();
        offer4.setInfo("MD","Chase",95000,false);

      //  System.out.println(offer3);

        String myLocation="BayArea";

        Offer[] offers = {offer1,offer2,offer3,offer4};

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));

        Accept.removeIf(each->each.salary<100_000 || !each.location.equals(myLocation) ); // we deleted all offers less than 100_000

        Accept.removeIf(eachFullTime->eachFullTime.isFullTime == false );




        System.out.println(Accept.size());



        for ( Offer eachOffer  : Accept  ){
            System.out.println(eachOffer);
        }







    }
}
