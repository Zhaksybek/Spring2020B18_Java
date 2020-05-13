package day38_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Toilet Paper", 20, 1);
        Item item2 = new Item("Apple",0.8,10);
        Item item3 = new Item("Orange",0.6,12);
        Item item4 = new Item("Egg",0.1,30);
        Item item5 = new Item("Khurma",10,1);

        ArrayList<Item> shoppingList =new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost = 0;

/*
        for (Item each  : shoppingList  ){
            totalCost+=each.calcCost();
        }

 */

        for (int i=0; i < shoppingList.size();i++){
            totalCost += shoppingList.get(i).calcCost();
        }

        System.out.println("Total cost: "+totalCost);


        //System.out.println(item1.calcCost());
        //System.out.println(item1);



    }
}
