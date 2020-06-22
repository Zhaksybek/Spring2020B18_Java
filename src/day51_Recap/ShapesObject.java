package day51_Recap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
    Note:   Volume of Cylinder = PI * radius * radius * height
            Area of Cylinder = (PI * diameter * radius) + (height * PI * diameter);
            Perimeter of Cylinder = 2 * (PI * diameter + height)
            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI
 */
public class ShapesObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);


        Cylinder cylinder1 = new Cylinder(3,5);
        Cylinder cylinder2 = new Cylinder(3,5);

        ArrayList<Shape> list = new ArrayList<>();

        list.addAll(Arrays.asList( circle1,circle2,cylinder1,cylinder2 ));


        Shape shape1 = circle1;

        //Shape shape = circle; // upcasting

        Shape shape2 = new Cylinder(3,6);
        // shape2.calculateVolume();

       for (Shape eachShape : list){
           System.out.println(eachShape.name+" : "+eachShape.calculateArea());
       }

       



    }

}
