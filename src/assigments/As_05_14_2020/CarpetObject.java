package assigments.As_05_14_2020;

public class CarpetObject {


    public static void main(String[] args) {

        Carpet c = new Carpet();
        System.out.println(c.totalPrice);

        Carpet c2 = new Carpet(20.0, 20.0 , 2.0 , false);
        System.out.println(c2.totalPrice); // 80

        Carpet c3 = new Carpet(20.0, 20.0 , 2.0 , true);
        System.out.println(c3.totalPrice); // 280


    }
}
