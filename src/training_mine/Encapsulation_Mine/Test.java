package training_mine.Encapsulation_Mine;

public class Test {

    public static void main(String[] args) {

        TestData obj = new TestData();
       // System.out.println(obj.name);

        obj.setName("KNB RK");
        //System.out.println(obj.getName());

        String name= obj.getName();

        System.out.println(name);

        TestData obj2 = new TestData();
        obj2.setName("FSB");


        System.out.println(  obj2.getName() );




    }

}
