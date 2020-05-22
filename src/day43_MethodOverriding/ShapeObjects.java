package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);


        circle1.calculateArea();     // bug(fixed)   Pi * r * r
        circle1.calculatePerimeter();// bug(fixed)  radius * PI * 2


        System.out.println("================================");

        Rectangle rec1 = new Rectangle(3,2);

        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.calculateArea();     //             w * l
        rec1.calculatePerimeter(); //


        System.out.println("========================================");

        Square sq1 = new Square(4);

        System.out.println(sq1.side);

        sq1.calculateArea();       //      side * side
        sq1.calculatePerimeter(); //








    }

}
