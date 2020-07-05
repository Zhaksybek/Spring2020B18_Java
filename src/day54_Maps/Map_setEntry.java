package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {

    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        countries.put("USA","Washington DC");
        countries.put("Pakistan","Islamabad");
        countries.put("Kazakhstan", "Astana");
        countries.put("East Turkistan","Urumqi");
        countries.put("Canada","Toronto");

        String input = "usa";
        for(Map.Entry<String, String>   each : countries.entrySet()  ) {
            // System.out.println( "Capital city of" + each.getKey() + " is : " + each.getValue() );
            String countryName = each.getKey();
            String cityName = each.getValue();

            if(input.equalsIgnoreCase(countryName)){
                System.out.println(cityName);
            }

        }









    }
}
