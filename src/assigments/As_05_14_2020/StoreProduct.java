package assigments.As_05_14_2020;

public class StoreProduct {

    String label;
    int price;
    String category="misc";
    boolean hasExpiration=false;
    int stock=0;

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, int stock) { //2
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public StoreProduct(String label, int price) { //3
        this.label = label;
        this.price = price;
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration) {//4
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
    }

    public void expired(boolean hasExpired){
        if (hasExpired==true){
            setStock(0);
        }
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean sale(int quantity){
        int tempor=stock-quantity;
        if (tempor>0){
            setStock(tempor);
            return true;
        }else {
            return false;
        }
    }

    public double getDiscountedPrice(double discount){
        return price * (1-discount);
    }



}
