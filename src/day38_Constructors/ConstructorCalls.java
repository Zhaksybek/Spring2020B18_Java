package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method2();

    }

    public ConstructorCalls(int a){
       // ConstructorCalls();
        this();
    }

    public static void method1(){
        method2();
        // ConstructorCalls();
    }

    public static void method2(){
        method1();
    }


}
