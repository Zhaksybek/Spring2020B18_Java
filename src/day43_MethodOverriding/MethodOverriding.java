package day43_MethodOverriding;

class Test{

    public void method(){
        System.out.println("Jack");
    }


}


public class MethodOverriding extends Test{

    @Override
    public void method(){
        System.out.println("Kalbinaz");
    }


    public static void main(String[] args) {
        Test obj = new Test();
        obj.method();    // Jack


        MethodOverriding obj2 = new MethodOverriding();
        obj2.method();
    }



}
