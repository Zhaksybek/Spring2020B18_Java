package training_mine.day38_ConstructorsMine;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("int constructor");

    }

    public ConstructorCalls(String str){
        this(4);
        System.out.println("String constructor");
    }

    public static void main(String[] args) {
        ConstructorCalls obj = new ConstructorCalls("struinf");
    }


    public static void  method1(){

    }

    public void method2(){

    }



}
