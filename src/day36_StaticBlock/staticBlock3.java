package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class staticBlock3 {

    static String name;
    static  int num;

    static Tester tester1 = new Tester();
   // tester1.setInfo();


    static {
        name ="Jack";
        num=100;
        tester1 = new Tester();
        tester1.setInfo("Kaka", "SDET",123000,123456);
    }


    public static void main(String[] args) {
        name = "Jack";
        num = 200;

        System.out.println(name);
        System.out.println(num);
    }


}
