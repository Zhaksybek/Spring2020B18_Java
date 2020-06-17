package day48_Abstraction;

class Train implements Interface_mine{
    @Override
    public void myMethod(){
        System.out.println("My method overridden by Interface");
    }


    public static void main(String[] args) {

       double test = 4 *  Interface_mine.PI;

       Train train1= new Train();
       train1.myMethod();


    }

}

public interface Interface_mine {

    double PI = 3.14;

    void myMethod();

}
