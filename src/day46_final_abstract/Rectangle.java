package day46_final_abstract;

import java.awt.geom.Area;

public class Rectangle extends Shape{

    public double a;
    public double b;

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void Area(){
        double area = a*b;
        System.out.println("Area is: "+area);
    }



}
