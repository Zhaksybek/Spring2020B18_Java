package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        LinkedHashMap<String, String> fb = new LinkedHashMap<>();

        fb.put("Tester00", "password1");
        fb.put("Tester01", "password1");
        fb.put("Tester01", "password1");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb.size());

        System.out.println("===============================");
        for (String eachKey : fb.keySet()) {

          //  System.out.println( eachKey +" " + fb.get(eachKey));
            System.out.println( eachKey);

        }

        System.out.println("==================================");


        fb.values();

        for (String eachValue: fb.values()){
            System.out.println(eachValue);
        }

        System.out.println("=============== Passwords=============");
        List<String> password = new ArrayList<>(  fb.values() );
        System.out.println(password);


        System.out.println("=============== username =============");
        List<String> username = new ArrayList<>(  fb.keySet() );
        System.out.println(username);


        System.out.println("============================================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Tanat",65);
        students.put("Abida",90);
        students.put("Nahide",90);
        students.put("Rahman",93);
        students.put("Jose",80);


        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for (String eachKey : students.keySet()){
            int eachValue = students.get(eachKey);

            if (eachValue < 90 ){
               badStudents.put(eachKey,eachValue);
            }else {
                goodStudents.put(eachKey,eachValue);
            }

        }

        System.out.println(badStudents);
        System.out.println(goodStudents);














    }
}
