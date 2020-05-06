package Hanna_training;

public class Pizza_1 {
    String size;
    int price;
    double pepperoniTop;
    int cheeseTop;


    public void FullPizza(String sizeP , int priceOfPizza, double pepperoniTop1, int cheeseTop1){

        if (sizeP.equals("Small")){
            priceOfPizza=10;
        }
        size=sizeP;
        price= priceOfPizza;
        cheeseTop= cheeseTop1;
        pepperoniTop= pepperoniTop1;
    }


    public String toString(){
        return size+": $"+price+" + "+pepperoniTop+" per peperoni topping + "+cheeseTop+" per cheese topping";
    }


}
