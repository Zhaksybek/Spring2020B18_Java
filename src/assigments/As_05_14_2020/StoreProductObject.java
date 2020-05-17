package assigments.As_05_14_2020;

public class StoreProductObject {

    public static void main(String[] args) {

        /*
        StoreProduct(String,int,String,boolean,int)
    StoreProduct s1 = new StoreProduct("Eggs",3,"Produce",true,10);
                      ^
    constructor StoreProduct.StoreProduct() is not applicable
      (actual and formal argument lists differ in length)
    constructor StoreProduct.StoreProduct(String,int,int) is not applicable
         */

      //  StoreProduct storeProduct1 = new StoreProduct();

        StoreProduct storeProduct2 = new StoreProduct("Food Label B", 30, 20);
        //  String label, int price, int stock

        StoreProduct storeProduct3 = new StoreProduct("Food Label C", 25);
        //String label, int price

        StoreProduct storeProduct4 = new StoreProduct("Food Label A",20,"Food",true);
        //String label, int price, String category, boolean hasExpiration

    }

}
