package training_mine.day43_methodOverridding;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void calculateArea(){
        area = width * length;
        System.out.println("Area of the rectangle: "+area);
    }
    @Override
    public void calculatePerimeter(){
        perimeter =(width+length)*2;
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }





}
