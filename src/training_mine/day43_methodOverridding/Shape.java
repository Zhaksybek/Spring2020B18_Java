package training_mine.day43_methodOverridding;

public class Shape {

    public double area;
    public double perimeter;


    public void calculateArea(){
        area = 0;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter =0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }



}
