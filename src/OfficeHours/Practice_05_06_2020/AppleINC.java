package OfficeHours.Practice_05_06_2020;

import day24_Methods.Test;

public class AppleINC {


    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Jack","Senior Tester",130_000,1993);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,1245);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);

        ScrumTeam scrum1 = new ScrumTeam();

        scrum1.hireTester(tester1);
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester2);

        scrum1.fireATester(1245);

        // scrum.teatersTeam  // returns the testerTeam

        for (Tester each : scrum1.testersTeam ){
            System.out.println(each);
            System.out.println();
        }


        System.out.println("==============================================================");


        Developer dev1 = new Developer();
        dev1.setInfo("Jack", "Developer", 150_000,223232);

        Developer dev2 = new Developer();
        dev2.setInfo("Marjan","Senior Developer",180000,12546);


        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);


       scrum1.fireDeveloper(12546);


       // System.out.println(scrum1.devTeam.size());


        for (  Developer each  : scrum1.devTeam  ){ // arrayList of developer in scrum team

            System.out.println(each);

        }

        System.out.println("==================================================");

        System.out.println("In my scrum team, we have "+scrum1.testersTeam.size()
                +" testers and "+scrum1.devTeam.size() +" developers");



        /*

        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */












    }
}
