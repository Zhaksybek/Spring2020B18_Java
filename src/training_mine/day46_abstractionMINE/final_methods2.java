package training_mine.day46_abstractionMINE;

class Test{
    public void method1(){
        System.out.println("A");
    }

}


public class final_methods2 extends Test{
    @Override
    public void method1(){
        System.out.println("B");  // to give different implementation
    }


}
