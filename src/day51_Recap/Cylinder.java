package day51_Recap;

public final class Cylinder extends Shape implements Volume,PI{

// so far: 5 var
    public double radius;
    public double height;

    static {
        name = "Cylinder";
    }

    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
    }


    @Override
    public double calculateVolume() {
        return PI * PI * radius * height;
    }

    @Override
    public double calculateArea() {
        return (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
