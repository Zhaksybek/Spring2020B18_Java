package day43_MethodOverriding;

public class CarShop {
    public static void main(String[] args) {

        Tesla tesla1 = new Tesla();

        tesla1.start();

        System.out.println("===========================");
        System.out.println();


        Honda honda1 = new Honda();
        honda1.start();


        System.out.println("===========================");

        Jeep jeep = new Jeep();
        jeep.start();

        System.out.println("===========================");

        BMW bmw1 = new BMW();
        bmw1.start();



    }
}
