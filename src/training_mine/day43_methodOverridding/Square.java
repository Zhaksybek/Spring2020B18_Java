package training_mine.day43_methodOverridding;

public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side=side;
    }
    @Override
    public void calculateArea(){
        area = side*side;
        System.out.println("Area of the square: "+area);
    }
    @Override
    public void calculatePerimeter(){
        perimeter =side*4;
        System.out.println("Perimeter of the square: "+perimeter);
    }


}
