package training_mine.day43_methodOverridding;

public class Circle extends Shape{

    public double radius;
    public static double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea(){
        area = PI * radius*radius;
        System.out.println("Area of the circle: "+area);
    }
    @Override
    public void calculatePerimeter(){
        perimeter = radius*2*PI ;
        System.out.println("Perimeter of the circle: "+perimeter);
    }




}
