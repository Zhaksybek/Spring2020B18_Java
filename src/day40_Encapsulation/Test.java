package day40_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

       // System.out.println(obj.SSN);

        System.out.println(obj.getSSN());

        // obj.SSN = 123456;

       obj.setSSN(123654);

        System.out.println(obj.getSSN());


    }


}