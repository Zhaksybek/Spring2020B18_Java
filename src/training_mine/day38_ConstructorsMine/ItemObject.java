package training_mine.day38_ConstructorsMine;

public class ItemObject {

    public static void main(String[] args) {

        Item item =new Item("Iphone",1200,1);

        System.out.println(item.calcCost());

        Item item2 =new Item("Potatoes",3.2,2);

        System.out.println(item2.calcCost());






    }


}
