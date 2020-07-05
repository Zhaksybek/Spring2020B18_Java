package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();

        employeeInfo.put("Jack", 130_000.0);
        employeeInfo.put("Abida", 128_000.0);

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        System.out.println(employeeInfo.get("Abida"));

        employeeInfo.remove("Abida");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        System.out.println("===============================");












    }
}
