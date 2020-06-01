package training_mine.day38_ConstructorsMine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ItemObject {

    public static void main(String[] args) {

        Item item1 =new Item("Iphone",1200,1);

        Item item2 =new Item("Potatoes",3.2,2);
        Item item3 =new Item("Mouse",10,1);
        Item item4 =new Item("Headphones",22,2);


        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4));

        double totalCost  = 0;

        for (int i=0; i<shoppingList.size();i++){
            totalCost+= shoppingList.get(i).calcCost();

        }

        System.out.println("$"+totalCost);












    }


}
