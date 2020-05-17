package assigments.As_05_14_2020;

public class Pizza {
    private String size;
    private int numOfCheese;
    private int numOfPep;
    private int ham;
    public Pizza(String size, int numOfCheese, int numOfPep, int ham) {
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPep = numOfPep;
        this.ham = ham;
    }
    public double calCost(){
        if(size.equalsIgnoreCase("small")){
            return  10+(2*numOfCheese)+(2*numOfPep)+(2*ham);
        }else if(size.equalsIgnoreCase("medium")){
            return  12+(2*numOfCheese)+(2*numOfPep)+(2*ham);
        }else {
            return  14+(2*numOfCheese)+(2*numOfPep)+(2*ham);
        }
    }
    public String getDescription(){
        return size+" Pizza with "+numOfCheese+" Cheese toppings, "+numOfPep+" Pepperoni toppings, and "+ham+
                " Ham toppings."+"\nPrice: "+calCost();
    }
   /* private String size;
    int cheeseTop;
    int pepperoniTop;
    int hamTop;




    public Pizza(String size, int cheeseTop, int pepperoniTop, int hamTop  ){
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepperoniTop=pepperoniTop;
        this.hamTop =hamTop;
    }

    public double calcCost(  ){
        if (size.equalsIgnoreCase("Small")){
            return  10 + 2 * (cheeseTop+pepperoniTop+hamTop);
        }else if (size.equalsIgnoreCase("Medium")){
            return  12 + 2 * (cheeseTop+pepperoniTop+hamTop);
        }else {
            return  14 + 2 * (cheeseTop+pepperoniTop+hamTop);
        }
    }

    public String getDescription(){
        return size+" Pizza with "+cheeseTop+" Cheese toppings, "+pepperoniTop+" Pepperoni toppings,"+
               " and "+ hamTop+" Ham toppings."+"\nTotal Price: "+calcCost();
    }

    */
  /*
     small Pizza with 1 Cheese toppings, 1 Pepperoni toppings,1 Ham toppings.
Total Price: 16.0
expected:<... Pepperoni toppings,[ and ]1 Ham toppings.Tota...>

but was:<... Pepperoni toppings,[]1 Ham toppings.Tota...>

-----------------------------------
org.junit.ComparisonFailure:
expected:<... Pepperoni toppings,[]1 Ham toppings. Tota...>

but was:<... Pepperoni toppings,[ and ]1 Ham toppings. Tota...>
     */

}
