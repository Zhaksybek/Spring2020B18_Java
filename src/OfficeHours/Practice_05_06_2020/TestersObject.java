package OfficeHours.Practice_05_06_2020;

public class TestersObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.name ="Jaksybek";
        tester1.employeeId=18121993;
        tester1.salary=130_000;
        tester1.jobTitle="SDET";


        System.out.println(tester1);

        System.out.println();

        Tester tester2 = new Tester();
        tester2.setInfo("Steve","SDET",120_000,12141997);

        Tester tester3 = new Tester();
        tester3.setInfo("Monica","QA",100_000,21331997);
        System.out.println(tester3);


        System.out.println();
        tester3.smokeTesting();


        System.out.println();

        tester1.creatingTicket();







    }


}
