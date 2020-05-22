package day43_MethodOverriding;

public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side=side;

    }

    // override calculateArea()
    @Override
    public void calculateArea(){
        area = side * side;
        System.out.println("Area of the square is: "+area);
    }
    // override calculatePerimeter()
    @Override
    public void calculatePerimeter(){
        perimeter = 4 * side;
        System.out.println("Perimeter of the square is: "+perimeter);
    }


}
