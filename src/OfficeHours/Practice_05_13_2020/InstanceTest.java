package OfficeHours.Practice_05_13_2020;



public class InstanceTest {

    public static void main(String[] args) {

       Instances obj1 = new Instances();
       obj1.name = "Jack";

       Instances obj2 = new Instances();
       obj2.name="Oljas";

        System.out.println( obj1.name );
        System.out.println( obj2.name );

        obj1.printName(); // Name is Jack
        obj2.printName();//  Name is: Oljas



    }


}

class InstanceBlock{

    public static void main(String[] args) {

        Instances obj =new Instances();
        System.out.println(obj.name);

    }

}
