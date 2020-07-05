package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Practice1 {
    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> classmatesInfo = new LinkedHashMap<>();

        classmatesInfo.put("Oljas", LocalDate.of(1993,9,16));
        classmatesInfo.put("Talha", LocalDate.of(1997,2,13));
        classmatesInfo.put("Ika", LocalDate.of(1989,9,5));
        classmatesInfo.put("Abida", LocalDate.of(1998,7,10));
        classmatesInfo.put("Monica", LocalDate.of(1998,6,3));

        classmatesInfo.put("Abida", LocalDate.of(1995,7,10));
        System.out.println( classmatesInfo.containsValue(LocalDate.of(1995,7,10)) );

       // classmatesInfo.remove("Oljas");


       // System.out.println(classmatesInfo.get("Monica"));

       // System.out.println(classmatesInfo.containsKey("Talha"));






    }
}
