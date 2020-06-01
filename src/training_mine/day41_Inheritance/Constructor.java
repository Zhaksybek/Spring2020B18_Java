package training_mine.day41_Inheritance;

class test{

    public test(int a){
        System.out.println("A");
    }

}

public class Constructor extends test {

    public Constructor(){
        super(4);
        System.out.println("B");

    }

    public static void main(String[] args) {
       // test obj = new test(4);
        Constructor obj = new Constructor();
    }


}
