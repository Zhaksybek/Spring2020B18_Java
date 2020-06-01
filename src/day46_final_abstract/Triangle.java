package day46_final_abstract;

public class Triangle extends Shape{


    public double a;
    public double b;

    public Triangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void Area(){
        double area = a * b * 0.5;
        System.out.println("Area is: "+area);
    }


}
