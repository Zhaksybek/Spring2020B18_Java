package assigments.As_05_17_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class test extends Catalog{
    public static void main(String[] args) {
         ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
         ArrayList<Double> monthlyPayments = new ArrayList<>();


        items.addAll(Arrays.asList("iPhone 6s","iPhone 6s Plus",
                "iPhone X", "MacbookPro", "ThumbDrive", "Beats HeadPhones", "Mouse",
                "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch"));

        prices.addAll(Arrays.asList( 449.0, 549.0 , 1149.0 ,  1499.99,  39.99,  349.99,
                79.99, 39.99,  429.0, 399.0,  2199.0, 559.0    ));

        monthlyPayments.addAll(Arrays.asList( 18.71,  22.88,   56.16,   79.49,  2.68,    15.12,
                8.98,   4.56, 18.31,  16.25,   89.49,  21.18    ));

        //prices.set(1, 500.0);
       // monthlyPayments.set(1,500.0/12);

        //System.out.println(prices);
       // System.out.println(monthlyPayments);
        // [[iPhone 6s-449.0-18.71, iPhone 6s Plus-549.0-22.88, ThumbDrive-39.99-2.68, Beats HeadPhones-349.99-15.12, Mouse-79.99-8.98, Charger-39.99-4.56, iPad-429.0-18.31, Dyson Vacuum-399.0-16.25, Apple Watch-559.0-21.18]]> but was:<[[]]>


        ArrayList<String> list =new ArrayList<>();
        for (int i=0; i< prices.size(); i++){
            if (prices.get(i) < 1148){
                list.add( items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i)  );
            }
        }
        System.out.println(list);






    }
}
