package day41_Inheritance.Task01;

public class EmployeeObject {
    public static void main(String[] args) {
        Developer dev1 =new Developer( "Jack",130_000,321654, "FullTime", 'M');


        dev1.coding();
        dev1.fixingBug();
        System.out.println(dev1);

        System.out.println("=============================");

        System.out.println();
        Tester tester1 =new Tester("Monica", 125_000, 65478,"FullTime",'F');
        tester1.reportingBug();
        tester1.testing();
        System.out.println(tester1);


        System.out.println("=================================");

        BusinessAnalyst ba1 = new BusinessAnalyst("Aiman",110_000, 123654,"Contructor",'M');
        ba1.gathering();
        ba1.writingRequiremnts();
        System.out.println(ba1);







    }
}
