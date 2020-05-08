package day36_StaticBlock;

public class StaticBlock {




    public static void main(String[] args) {   // then main method
        System.out.println("Hello Cybertek");
        method();
    }

    public static void method(){
        System.out.println("Custom method executed");
    }

    static {
        System.out.println("Hello Jack"); // first static block
    }





}
