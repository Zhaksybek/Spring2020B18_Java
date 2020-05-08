package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

   static  Developer dev1 = new Developer();
   static  Developer dev2 = new Developer();
   static Developer dev3 = new Developer();
   static Developer dev4 = new Developer();
   static Developer dev5 = new Developer();

   static {
       dev1.setInfo("Saia","Developer",130_000,19931);
       dev2.setInfo("Jack","Developer",120_000,19932);
       dev3.setInfo("Matt","Developer",100_000,19933);
       dev4.setInfo("John","Senior Developer",160_000,19934);
       dev5.setInfo("Mehmet","Junior Developer",130_000,19935);



   }



/*
    public static void main(String[] args) {
        dev1.setInfo("Jack","Dveloper",130_000,1993);

    }

 */




}
